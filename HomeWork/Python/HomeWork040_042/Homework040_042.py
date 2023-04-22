import pandas as pd

data = pd.read_csv('sample_data/california_housing_train.csv')
"""
Задача №40:
Работать с файлом california_housing_train.csv, который находится в папке sample_data. Определить среднюю стоимость
дома, где кол-во людей от 0 до 500 (population)
"""

average_cost = data[data['population'] <= 500]['medianHouseValue'].median()
print(average_cost)

"""
Задача №42:
Узнать какая максимальная households в зоне минимального значения population
"""

max_households = data[data['population'] == data['population'].min()]['households'].max()
print(max_households)
