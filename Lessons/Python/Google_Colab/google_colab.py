import pandas as pd
import seaborn as sns

df = pd.read_csv('california_housing_train.csv')

#print(df.head())
# print(df[(df['housingMedianAge'] < 20) & (df['housingMedianAge'] > 10)][['totalRooms', 'housingMedianAge']])
#
# print(df.describe())

print(sns.scatterplot(data=df, x="longitude", y="latitude"))
