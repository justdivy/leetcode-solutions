Select id, movie, description, rating
from Cinema where id % 2 = 1
AND description != 'boring'
Order by rating Desc;