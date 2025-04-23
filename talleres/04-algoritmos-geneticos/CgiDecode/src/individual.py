
ID_COUNTER = -1


def get_id() -> int:
    global ID_COUNTER
    ID_COUNTER += 1
    return ID_COUNTER


class Individual:
    def __init__(self, test_suite):
        self.id = get_id()
        self.test_suite = test_suite
        self._fitness = None

    def __str__(self):
        return f"Individual {self.id} (fitness: {self._fitness}): {self.test_suite}"

    def set_fitness(self, fitness):
        self._fitness = fitness

    def get_fitness(self):
        return self._fitness
