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

# a operación de comparación. Las comparaciones puede ser “Eq” (==), “Ne” (!=), “Lt”
# (<), “Gt” (>), “Le” (<=), “Ge” (>=), “In” (pertenencia a una colección, e.g., x ∈ C)
def evaluate_condition(condition_num: int, op: str, lhs: Union[str, int], rhs: Union[str, int, Dict]) -> bool:
    global condition_result, branch_distance

    if isinstance(lhs, str):
        lhs = ord(lhs)
    if isinstance(rhs, str):
        rhs = ord(rhs)

    if op == 'Eq':
        condition_result = lhs == rhs
        branch_distance = abs(lhs - rhs)

    elif op == 'Ne':
        condition_result = lhs != rhs
        branch_distance = abs(lhs - rhs)

    elif op == 'Ge':
        condition_result = lhs >= rhs
        branch_distance = abs(lhs - rhs)

    elif op == 'Le':
        condition_result = lhs <= rhs
        branch_distance = abs(lhs - rhs)

    elif op == 'Lt':
        condition_result = lhs < rhs
        branch_distance = abs(lhs - rhs) + 1

    elif op == 'Gt':
        condition_result = lhs > rhs
        branch_distance = abs(lhs - rhs) + 1

    elif op == 'In':
        branch_distance = min([abs(lhs - ord(key)) for key in rhs.keys()])
        condition_result = branch_distance == 0

    else:
        raise ValueError('Unknown condition operator')

    update_condition_distances_for_math_ops(condition_num, condition_result, branch_distance)
    return condition_result


def update_condition_distances_for_math_ops(condition_num, condition_result, branch_distance):
    if condition_result:
        update_maps(condition_num, 0, branch_distance)
    else:
        update_maps(condition_num, branch_distance, 0)
