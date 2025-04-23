from typing import List

from src.evaluate_condition import clear_maps
from src.individual import Individual


def get_fitness_cgi_decode(individual: Individual) -> float:
    # Borro la información de branch coverage de ejecuciones anteriores
    # Recuerden que los diccionarios true_distances y false_distances son globales
    clear_maps()

    fitness = 0
    # TODO: COMPLETAR
    return 0
