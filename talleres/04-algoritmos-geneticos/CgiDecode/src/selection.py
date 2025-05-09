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

    current_winner = competitors[0]
    current_winner_fitness = get_fitness_cgi_decode(competitors[0])

    for competitor in competitors:
        current_competitor_fitness = get_fitness_cgi_decode(competitor)

        if current_competitor_fitness > current_winner_fitness:
            current_winner = competitor
            current_winner_fitness = current_competitor_fitness

    return current_winner


def selection(selection_function, tournament_size: int, population: list[Individual]) -> Tuple[Individual, Individual]:
    """
    Selecciona dos individuos de la poblacion usando seleccion por torneo.
    """
    parent1 = None
    parent2 = None
    # TODO: COMPLETAR

    return parent1, parent2
