import random
from string import printable
from typing import List

from src.individual import Individual

def get_random_character() -> str:
    return random.choice(printable)


def create_test_case() -> str:
    total_chars = random.randint(0,10)
    string_to_test = ""
    for i in range(total_chars):
        string_to_test += get_random_character()
    return string_to_test


def create_individual() -> Individual:
    total_tests = random.randint(1,15)
    test_suite = []

    for i in range(total_tests):
        test_suite.append(create_test_case())

    return Individual(test_suite)


def create_population(population_size: int) -> List[Individual]:
    population = []

    for i in range(population_size):
        population.append(create_individual())

    return population
