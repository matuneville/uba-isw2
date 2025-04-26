from typing import List

from src.evaluate_condition import clear_maps
from src.individual import Individual

from src.evaluate_condition import has_reached_condition, get_true_distance, get_false_distance
from src.cgi_decode_instrumented import cgi_decode_instrumented


def get_fitness_cgi_decode(individual: Individual) -> float:
    # Borro la información de branch coverage de ejecuciones anteriores
    # Recuerden que los diccionarios true_distances y false_distances son globales
    clear_maps()

    fitness = 0

    run_all_test_cases_from_individual(individual)
    global distances_true, distances_false

    # TODO
    for i in range(1, 6):
        if has_reached_condition(i):
            distance_true = get_true_distance(i)
            fitness += normalize(distance_true)
        else:
            fitness += 1

    return fitness



def run_all_test_cases_from_individual(individual):
    for test_case in individual.test_suite:
        try:
            cgi_decode_instrumented(test_case)
        except:
            pass


def normalize(distance: float) -> float:
    return distance / (distance + 1)