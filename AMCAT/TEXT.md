Fountains are installed at every position along a one-dimensional garden of length n. Array locations[] represents the coverage limit of these fountains. The ith fountain (where 1sisn) has a coverage limit of locations[i] that can range from the position max((i – locations[i]), 1) to min((i + locations[i]), n ). In other words, the h fountains do not reach outside the boundaries of the garden. In the beginning,all the fountains are switched off. Determine the minimum number of fountains that need to be activated to cover the n length garden by water.

Example

n = 3
locations[] = {0, 2, 13, then
For position 1: locations[1] = 0, max((1 – 0),
1) to mini (1+0), 3) gives range = 1 to 1
For position 2: locations[2] = 2, max((2-2),
1) to min( (2+2), 3) gives range = 1 to 3
For position 3: locations[3] = 1, max( (3-1),
1) to min( (3+1), 3) gives range = 2 to 3
For the entire length of this garden to be covered, only the fountain at position 2 needs to be activated.

Function Description

Complete the function fountainActivation in the editor below.

fountainActivation has the following Parameter:

int locations[n]: the fountain locations
Returns

int: the minimum number of fountains that must be activated
Constraints

1<_n<_ 10^5
 O<_locations[i] <_ mini (n,100) (where 1 <_1<_10^5)
► Input Format For Custom Testing

Sample Case 0

Sample Input For Custom Testing

3 ->locations[] size n = 3
1 ->locations[] [1, 1, 1
1 ->Sample Output
Sample Output

1
Explanation

Here, locations = {1, 1, 13

For position 1: locations[1] = 1, maxi (1 -1), 1) to min((1+1), 3) gives range = 1 to 2
For position 2: locations[2] = 1, max( (2 -1), 1) to min( (2+1), 3) gives range = 1 to 3
For position 3: locations[3] = 1, max((3 -1), 1) to min((3+1), 3) gyes range = 2 to 3
If the 2nd fountain is active, the range from position 7 to 3 will be covered. The total number of fountains needed is 1.

