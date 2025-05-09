from random import choice, randint, random
from typing import List

from src.create_population import create_test_case, get_random_character
from src.individual import Individual


def add_character(test_case: str) -> str:
    """
    Añade un caracter al azar a un test case.
    """
    mutated_test_case = test_case + get_random_character()
    return mutated_test_case


def remove_character(test_case: str) -> str:
    """
    Elimina un caracter al azar de un test case.
    """
    char_index_to_remove = randint(0, len(test_case)-1)
    mutated_test_case = test_case[:char_index_to_remove] + test_case[char_index_to_remove+1:]
    return mutated_test_case


def modify_character(test_case: str) -> str:
    """
    Modifica un caracter al azar de un test case.
    """
    char_index_to_modify = randint(0, len(test_case) - 1)
    return (
        test_case[:char_index_to_modify]
        + get_random_character()
        + test_case[char_index_to_modify + 1:]
    )
    return test_case


def add_test_case(individual: Individual) -> Individual:
    """
    Añade un test case al azar a un individuo.
    """
    new_test_case = create_test_case()
    individual.test_suite.append(new_test_case)
    return individual


def remove_test_case(individual: Individual) -> Individual:
    """
    Elimina un test case al azar de un individuo.
    """
    random_index = randint(0, len(individual.test_suite) - 1)
    individual.test_suite.pop(random_index)
    return individual


def modify_test_case(individual: Individual) -> Individual:
    """
    Modifica un test case al azar de un individuo.
    """
    if not individual.test_suite:
        return individual

    test_case_to_modify_index = randint(0, len(individual.test_suite) - 1)
    test_case_to_modify = individual.test_suite[test_case_to_modify_index]

    mutation_functions = []

    if len(test_case_to_modify) < 10:
        mutation_functions.append(add_character)
    if len(test_case_to_modify) > 1:
        mutation_functions.append(remove_character)
    if len(test_case_to_modify) >= 1:
        mutation_functions.append(modify_character)
    
    # Si hay mutacion a aplicar al test case, lo muto
    if mutation_functions:
        mutation_fn = choice(mutation_functions)
        individual.test_suite[test_case_to_modify_index] = mutation_fn(test_case_to_modify)

    # Si no, no lo muto
    return individual


def mutate(individual: Individual) -> Individual:
    """
    Aplica una mutación al azar a un individuo.
    """
    test_suite_mutation_function = []
    
    if len(individual.test_suite) < 15:
        test_suite_mutation_function.append(add_test_case)

    if len(individual.test_suite) > 1:
        test_suite_mutation_function.append(remove_test_case)

    if len(individual.test_suite) >= 1:
        test_suite_mutation_function.append(modify_test_case)

    # Si se puede aplicar funcion de mutacion, muto individuo
    if test_suite_mutation_function:
        mutation_fn = choice(test_suite_mutation_function)
        return mutation_fn(individual)

    # Si no, no muto individuo
    return individual


def mutation(mutation_function, mutation_prob, individual: Individual) -> Individual:
    """
    Muta a un individuo con una probabilidad dada.
    """
    if random() < mutation_prob:
        mutated_individual = mutation_function(individual)
        return mutated_individual
    else:
        return individual


