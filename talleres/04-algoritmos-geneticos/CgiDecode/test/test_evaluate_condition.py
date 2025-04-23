#!./venv/bin/python
import unittest
from src.evaluate_condition import evaluate_condition


class TestEvaluateCondition(unittest.TestCase):
    # ==
    def test_equal_same_numbers_return_true(self):
        self.assertTrue(evaluate_condition(1, "Eq", 13, 13))

    def test_equal_different_numbers_return_false(self):
        self.assertFalse(evaluate_condition(1, "Eq", 13, 99))

    def test_equal_different_chars_return_false(self):
        self.assertFalse(evaluate_condition(1, "Eq", 'A', 'B'))

    # !=
    def test_notequal_different_numbers_return_true(self):
        self.assertTrue(evaluate_condition(1, "Ne", 13, 99))

    def test_notequal_same_numbers_return_false(self):
        self.assertFalse(evaluate_condition(1, "Ne", 13, 13))

    # >
    def test_greater_first_number_greater_than_second_return_true(self):
        self.assertTrue(evaluate_condition(1, "Gt", 99, 13))

    def test_greater_second_number_greater_than_first_return_false(self):
        self.assertFalse(evaluate_condition(1, "Gt", 13, 99))

    # <
    def test_lesser_first_number_greater_than_second_return_false(self):
        self.assertFalse(evaluate_condition(1, "Lt", 99, 13))

    def test_lesser_second_number_greater_than_first_return_true(self):
        self.assertTrue(evaluate_condition(1, "Lt", 13, 99))

    # >=
    def test_greaterequal_first_number_greater_than_second_return_true(self):
        self.assertTrue(evaluate_condition(1, "Ge", 14, 13))

    def test_greaterequal_first_number_lesser_than_second_return_false(self):
        self.assertFalse(evaluate_condition(1, "Ge", 13, 14))

    # <=
    def test_lesserequal_first_number_greater_than_second_return_false(self):
        self.assertFalse(evaluate_condition(1, "Le", 99, 13))

    def test_lesserequal_second_number_greater_than_first_return_true(self):
        self.assertTrue(evaluate_condition(1, "Le", 13, 99))

    # In
    def test_in_char_present_in_map_keys_return_true(self):
        self.assertTrue(evaluate_condition(1, "In", 'C', {'A':1, 'B':4, 'C':5}))

    def test_in_char_not_present_in_map_keys_return_false(self):
        self.assertFalse(evaluate_condition(1, "In", 'Z', {'A': 1, 'B': 4, 'C': 5}))

    # Invalid operator
    def test_invalid_binary_operator(self):
        self.assertRaises(ValueError, evaluate_condition, 1,"JIJO", 'Z', 1)