from random import randint, random
from typing import List, Tuple

from individual import Individual


def single_point_crossover(parent1: Individual, parent2: Individual) -> Tuple[Individual, Individual]:
    """
    Realiza un cruce de un punto entre dos padres.

    Single-point crossover:
        Elegir un único punto en los padres y dividir/unir en 
        ese punto
    """
     # Divido entre 1 o en len-1 ya que, si tomo 0 o len, los hijos podrían quedar igual a los padres
    division_point = randint(1, len(parent1)-1)

    offspring1 = parent1[:division_point] + parent2[division_point:]
    offspring2 = parent2[:division_point] + parent1[division_point:]

    return offspring1, offspring2


def crossover(crossover_function, crossover_prob, parent1: Individual, parent2: Individual) -> Tuple[Individual, Individual]:
    """
    Realiza el cruce entre dos padres, dada una probabilidad.
    """
    if random() < crossover_prob:
        offspring1, offspring2 = single_point_crossover(parent1, parent2)
    
    else:
        offspring1, offspring2 = parent1, parent2

    return offspring1, offspring2