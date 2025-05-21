#!./venv/bin/python
import unittest

from random import seed
from src.genetic_algorithm import GeneticAlgorithm


class TestGeneticAlgorithm(unittest.TestCase):
    def test1(self):
        seed(2002)
        ga = GeneticAlgorithm()
        result = ga.run()
        #print(f"""----- Test 1 -----
        #      Generaciones: {ga.get_generation()},
        #      Fitness mejor individuo: {ga.get_fitness_best_individual()},
        #      Branch cvg mejor individuo: {ga.get_branch_coverage_best_individual()}""")
        self.assertEqual(ga.get_generation(), 11)
        self.assertEqual(ga.get_fitness_best_individual(), 0.0)
        self.assertEqual(ga.get_branch_coverage_best_individual(), 0.0)

    def test2(self):
        seed(1310)
        ga = GeneticAlgorithm()
        result = ga.run()
        #print(f"""----- Test 2 -----
        #      Generaciones: {ga.get_generation()},
        #      Fitness mejor individuo: {ga.get_fitness_best_individual()},
        #      Branch cvg mejor individuo: {ga.get_branch_coverage_best_individual()}""")
        self.assertEqual(ga.get_generation(), 3)
        self.assertEqual(ga.get_fitness_best_individual(), 0.0)
        self.assertEqual(ga.get_branch_coverage_best_individual(), 0.0)

    def test_03(self):
        seed(1111)
        ga = GeneticAlgorithm()
        result = ga.run()
        #print(f"""----- Test 3 -----
        #      Generaciones: {ga.get_generation()},
        #      Fitness mejor individuo: {ga.get_fitness_best_individual()},
        #      Branch cvg mejor individuo: {ga.get_branch_coverage_best_individual()}""")
        self.assertEqual(ga.get_generation(), 17)
        self.assertEqual(ga.get_fitness_best_individual(), 0.0)
        self.assertEqual(ga.get_branch_coverage_best_individual(), 0.0)


"""
----- Test 1 -----
        New best fitness value: 1.0
        New best fitness value: 0.75
        New best fitness value: 0.75
        New best fitness value: 0.5
        New best fitness value: 0.5
        New best fitness value: 0.5
        New best fitness value: 0.5
        New best fitness value: 0.5
        New best fitness value: 0.5
        New best fitness value: 0.5
        New best fitness value: 0.0
              Generaciones: 11,
              Fitness mejor individuo: 0.0,
              Branch cvg mejor individuo: 0.0
----- Test 2 -----
        New best fitness value: 0.5
        New best fitness value: 0.5
        New best fitness value: 0.0
              Generaciones: 3,
              Fitness mejor individuo: 0.0,
              Branch cvg mejor individuo: 0.0
----- Test 3 -----
        New best fitness value: 1.0
        New best fitness value: 0.5
        New best fitness value: 0.5
        New best fitness value: 0.5
        New best fitness value: 0.5
        New best fitness value: 0.5
        New best fitness value: 0.5
        New best fitness value: 0.5
        New best fitness value: 0.5
        New best fitness value: 0.5
        New best fitness value: 0.5
        New best fitness value: 0.5
        New best fitness value: 0.5
        New best fitness value: 0.5
        New best fitness value: 0.5
        New best fitness value: 0.5
        New best fitness value: 0.0
              Generaciones: 17,
              Fitness mejor individuo: 0.0,
              Branch cvg mejor individuo: 0.0
"""