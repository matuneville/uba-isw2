from random import sample
from typing import Tuple, List

from src.individual import Individual
from src.get_fitness_cgi_decode import get_fitness_cgi_decode


def tournament_selection(population: List[Individual], tournament_size: int) -> Individual:
    """
    Selecciona un individuo de la poblacion usando seleccion por torneo.
    El tamaño del torneo es el número de individuos que competiran en el mismo.
    """
    competitors = sample(population, tournament_size)

    winner = max(competitors, key=lambda individual: individual.get_fitness())

    return winner


def selection(selection_function, tournament_size: int, population: list[Individual]) -> Tuple[Individual, Individual]:
    """
    Selecciona dos individuos de la poblacion usando seleccion por torneo.
    """
    parent1 = selection_function(population, tournament_size)
    parent2 = selection_function(population, tournament_size)

    return parent1, parent2
