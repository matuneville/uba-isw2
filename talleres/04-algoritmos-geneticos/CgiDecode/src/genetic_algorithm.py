from src.create_population import create_population
from src.crossover import crossover
from src.evaluate_population import evaluate_population
from src.mutate import mutate
from src.selection import selection


class GeneticAlgorithm:
    def __init__(self):
        self.population_size = 100
        self.tournament_size = 5
        self.p_crossover = 0.70
        self.p_mutation = 0.20

        self.generation = 0
        self.best_individual = None
        self.fitness_best_individual = None

    def get_best_individual(self):
        return self.best_individual

    def get_fitness_best_individual(self):
        return self.fitness_best_individual

    def get_generation(self):
        return self.generation

    def covered_all_branches(self, fitness_individual):
        """
        Dado el fitness de un individuo, retorna True si cubre todos los objetivos.
        """
        # TODO: COMPLETAR
        return False

    def calculate_best_individual(self, population):
        """
        Guarda el mejor individuo y su fitness en las variables de instancia, self.best_individual y
        self.fitness_best_individual
        """
        # TODO: COMPLETAR
        pass

    def run(self):
        """
        Ejecuta el algoritmo genetico.
        """
        # Generar y evaluar la poblacion inicial
        population = None # TODO: COMPLETAR
        # TODO: COMPLETAR

        # Imprimir el mejor valor de fitness encontrado
        self.calculate_best_individual(population)
        print("Best fitness value:" + str(self.fitness_best_individual))

        # Continuar mientras la cantidad de generaciones es menor que 1000
        # y no haya ningun individuo que cubra todos los objetivos

        while False: # TODO: COMPLETAR
            # Producir una nueva poblacion basándose en la anterior, mediante crossover y mutation.
            new_population = []

            while len(new_population) < self.population_size:
                # selection
                parent1, parent2 = None, None # TODO: COMPLETAR

                # crossover
                offspring1, offspring2 = None, None # TODO: COMPLETAR

                # mutation
                # TODO: COMPLETAR

                # Añadir los hijos a la nueva poblacion
                new_population.append(offspring1)
                new_population.append(offspring2)

            self.generation += 1

            # Una vez creada, evaluarla y reemplazar la poblacion anterior con la nueva
            # TODO: COMPLETAR
            population = new_population

            # Imprimir el mejor valor de fitness
            self.calculate_best_individual(population)
            print("New best fitness value: " + str(self.fitness_best_individual))

        # retornar el mejor individuo de la última generacion
        return self.best_individual
