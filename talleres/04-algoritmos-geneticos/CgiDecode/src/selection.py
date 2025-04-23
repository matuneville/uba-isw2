from random import sample
from typing import Tuple, List

from src.individual import Individual


def tournament_selection(population: List[Individual], tournament_size: int) -> Individual:
    """
    Selecciona un individuo de la poblacion usando seleccion por torneo.
    El tamaño del torneo es el número de individuos que competiran en el mismo.
    """
    winner = None
    # TODO: COMPLETAR
    return winner


def selection(selection_function, tournament_size: int, population: list[Individual]) -> Tuple[Individual, Individual]:
    """
    Selecciona dos individuos de la poblacion usando seleccion por torneo.
    """
    parent1 = None
    parent2 = None
    # TODO: COMPLETAR

    return parent1, parent2
