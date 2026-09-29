select x, y, z,
    Case 
        when x + y > z
        AND x + z > y
        AND y + z > x
        Then 'Yes'
        Else 'No'
    END As triangle
from Triangle;