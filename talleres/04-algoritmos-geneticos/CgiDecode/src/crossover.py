from random import randint, random
from typing import List, Tuple

from src.individual import Individual


def single_point_crossover(parent1: Individual, parent2: Individual) -> Tuple[Individual, Individual]:
    """
    Realiza un cruce de un punto entre dos padres.

    Single-point crossover:
        Elegir un único punto en los padres y dividir/unir en 
        ese punto
    """
    division_point = randint(0, len(parent1.test_suite))

    offspring1 = Individual(parent1.test_suite[:division_point] + parent2.test_suite[division_point:])
    offspring2 = Individual(parent2.test_suite[:division_point] + parent1.test_suite[division_point:])

    return offspring1, offspring2


def crossover(crossover_function, crossover_prob, parent1: Individual, parent2: Individual) -> Tuple[Individual, Individual]:
    """
    Realiza el cruce entre dos padres, dada una probabilidad.
    """
    if random() < crossover_prob:
        offspring1, offspring2 = crossover_function(parent1, parent2)
    
    else:
        offspring1, offspring2 = parent1, parent2

    return offspring1, offspring2