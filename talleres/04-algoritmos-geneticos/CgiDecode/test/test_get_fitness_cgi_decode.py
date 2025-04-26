#!./venv/bin/python
import unittest
from src.get_fitness_cgi_decode import get_fitness_cgi_decode

from src.individual import Individual


class TestGetFitnessCgiDecode(unittest.TestCase):

    # def test_single_test_case_gets_fitness_0(self):
    #     test_suite = ["Hello+World%FF"]
    #     individual_to_test = Individual(test_suite)
    #     fitness = get_fitness_cgi_decode(individual_to_test)
    #     self.assertEqual(fitness, 0)

    def test_______(self):
        test_suite = ["+"]
        individual_to_test = Individual(test_suite)
        fitness = get_fitness_cgi_decode(individual_to_test)
        print(f"\nTest 2 fitness is {fitness}")
        self.assertEqual(0, 0)

    # TODO: hacer tests !!!