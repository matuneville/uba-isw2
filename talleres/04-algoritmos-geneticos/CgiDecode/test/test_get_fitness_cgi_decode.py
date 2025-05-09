#!./venv/bin/python
import unittest
from src.get_fitness_cgi_decode import get_fitness_cgi_decode

from src.individual import Individual


class TestGetFitnessCgiDecode(unittest.TestCase):

    def run_fitness_test(self, test_input, expected_fitness):
        individual = Individual(test_input)
        fitness = get_fitness_cgi_decode(individual)
        self.assertEqual(fitness, expected_fitness)

    def test_case_aa(self):
        self.run_fitness_test(["%AA"], 2.357142857142857)

    def test_case_au(self):
        self.run_fitness_test([r"\%AU"], 3.03021978021978)

    def test_case_uu(self):
        self.run_fitness_test([r"\%UU"], 4.53021978021978)

    def test_case_plus(self):
        self.run_fitness_test(["+"], 6.5)

    def test_case_hello_reader(self):
        self.run_fitness_test(["Hello+Reader"], 4.972222222222222)

    def test_case_empty_string(self):
        self.run_fitness_test([""], 8.5)

    def test_case_incomplete_hex(self):
        self.run_fitness_test(["%A"], 6.023809523809524)

    def test_case_multiple_mixed_invalid(self):
        self.run_fitness_test(["%A", "%", r"\%1+", "%+1", "a+%AA"], 0)

    def test_case_percent_only(self):
        self.run_fitness_test(["%"], 5.857142857142858)