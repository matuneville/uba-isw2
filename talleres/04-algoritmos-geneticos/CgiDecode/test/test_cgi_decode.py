#!./venv/bin/python
import unittest
from src.cgi_decode import cgi_decode


class TestCgiDecode(unittest.TestCase):
    # def testExample(self):
    #     # TODO COMPLETAR
    #     cgi_decode("Hello World")
    #     self.assertTrue(True)
    #     self.assertFalse(False)

    def test_invalid_digit_high_raises_exception(self):
        self.assertRaises(ValueError, cgi_decode,"%JIJO")

    def test_invalid_digit_low_raises_exception(self):
        self.assertRaises(ValueError, cgi_decode,"%AKJJJJJJJJ")

    def test_decode_of_string_without_ascii_is_the_same_string(self):
        string_without_ascii = 'jijo'
        self.assertEqual(cgi_decode(string_without_ascii), string_without_ascii)

    def test_string_with_ascii_returns_correct_value(self):
        expected_ascii = 'ÿ test'
        self.assertEqual(cgi_decode('%FF+test'), expected_ascii)
