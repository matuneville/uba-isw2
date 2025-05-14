from typing import List

from src.get_fitness_cgi_decode import get_fitness_cgi_decode
from src.individual import Individual


def evaluate_population(population: List[Individual]):
    """
    Evalúa la población y asigna el valor de fitness a cada individuo.
    """
    for individual in population:
        individual.set_fitness(get_fitness_cgi_decode(individual))
