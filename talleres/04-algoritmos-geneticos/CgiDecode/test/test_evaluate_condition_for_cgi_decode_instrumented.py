#!./venv/bin/python
import unittest
from src.cgi_decode import cgi_decode
from src.cgi_decode_instrumented import cgi_decode_instrumented
from src.evaluate_condition import clear_maps, get_true_distance, get_false_distance

class TestEvaluateConditionForCgiDecodeInstrumented(unittest.TestCase):
    def setUp(self):
        clear_maps()

    def test_instrumented_returns_the_same_than_original(self):
        instrumented = cgi_decode_instrumented("Hello+World")
        original = cgi_decode("Hello+World")
        self.assertEqual(instrumented, original)

    def test_distances_from_example_are_correct(self):
        expected_true_distances = {1: 0, 2: 0, 3: 35}
        expected_false_distances = {1: 0, 2: 0, 3: 0}
        cgi_decode_instrumented("Hello+World")
        for i in range(1,4):
            self.assertEqual(get_true_distance(i), expected_true_distances[i])
            self.assertEqual(get_false_distance(i), expected_false_distances[i])

    def test_distances_are_all_0_when_all_branches_are_covered(self):
        cgi_decode_instrumented("Hello+World%FF")
        for i in range(1,6):
            self.assertEqual(get_false_distance(i), 0)
            self.assertEqual(get_true_distance(i), 0)

    def test_invalid_digit_high_raises_exception(self):
        self.assertRaises(ValueError, cgi_decode_instrumented, "Hello+World%ZF")

    def test_invalid_digit_raises_exception(self):
        self.assertRaises(ValueError, cgi_decode_instrumented, "Hello+World%FZ")

