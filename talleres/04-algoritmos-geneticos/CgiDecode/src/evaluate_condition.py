import sys
from typing import Dict, Union

# Inicializar mappings globales
distances_true: Dict[int, int] = {}
distances_false: Dict[int, int] = {}


def update_maps(condition_num: int, d_true: int, d_false: int):
    global distances_true, distances_false

    if condition_num in distances_true.keys():
        distances_true[condition_num] = min(
            distances_true[condition_num], d_true)
    else:
        distances_true[condition_num] = d_true

    if condition_num in distances_false.keys():
        distances_false[condition_num] = min(
            distances_false[condition_num], d_false)
    else:
        distances_false[condition_num] = d_false


def clear_maps():
    global distances_true, distances_false
    distances_true.clear()
    distances_false.clear()


def get_true_distance(condition_num: int) -> Union[int, None]:
    global distances_true
    if condition_num in distances_true.keys():
        return distances_true[condition_num]
    else:
        return None


def get_false_distance(condition_num: int) -> Union[int, None]:
    global distances_false
    if condition_num in distances_false.keys():
        return distances_false[condition_num]
    else:
        return None


def has_reached_condition(condition_num: int) -> bool:
    global distances_true, distances_false
    return condition_num in distances_true.keys() or condition_num in distances_false.keys()


def evaluate_condition(condition_num: int, op: str, lhs: Union[str, int], rhs: Union[str, int, Dict]) -> bool:
    distance_true = 0
    distance_false = 0
    
    if type(rhs) is str:
        lhs = ord(lhs)
        rhs = ord(rhs)

    if op == "Eq":
        if lhs == rhs:
            distance_false += 1
        else:
            distance_true += abs(lhs - rhs)

    elif op == "Ne":
        if lhs != rhs:
            distance_false += abs(lhs - rhs)
        else:
            distance_true += 1

    elif op == "Lt":
        if lhs < rhs:
            distance_false = rhs - lhs
        else:
            distance_true = lhs - rhs + 1

    elif op == "Gt":
        if lhs > rhs:
            distance_false = lhs - rhs
        else:
            distance_true = rhs - lhs + 1

    elif op == "Le":
        if lhs <= rhs:
            distance_false = rhs - lhs + 1
        else:
            distance_true = lhs - rhs

    elif op == "Ge":
        if lhs >= rhs:
            distance_false = lhs - rhs + 1
        else:
            distance_true = rhs - lhs

    elif op == "In":
        distance_true = min(abs(ord(clave) - ord(lhs)) for clave in rhs)
        distance_false = 1 if distance_true == 0 else 0


    update_maps(condition_num, distance_true, distance_false)
    return distance_true == 0
