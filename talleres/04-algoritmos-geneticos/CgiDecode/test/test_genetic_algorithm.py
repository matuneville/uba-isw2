#!./venv/bin/python
import unittest

from random import seed
from src.genetic_algorithm import GeneticAlgorithm


class TestGeneticAlgorithm(unittest.TestCase):
    def test1(self):
        # TODO COMPLETAR
        seed(1)
        ga = GeneticAlgorithm()
        result = ga.run()
        self.assertEqual(True, True)

    def test2(self):
        # TODO COMPLETAR
        pass

    def test_03(self, expected_fitness):
        seed(13)
        ga = GeneticAlgorithm()
        best = ga.run()
        print("Generations:", ga.get_generation())
        print("Fitness:", ga.get_fitness_best_individual())
