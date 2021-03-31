Make a message scheduling program which takes in a number of messages sent by
users and schedules them in uniform distribution. For example take a list of users with
messages
A. 3
B. 2
C. 1
For the users A, B, and C, with message count 3, 2 and 1 respectively; The messages
can get scheduled in sequence ‘ABCABA’, note that there may be more than one
possible sequence or in some cases no perfect sequence..
The program should be able to parse a CSV of input messages and generate the
sequence of message schedule as uniformly distributed as possible.



Solution;

1. read the csv
2. convert  data in map(key, value) pair
3. calculate how many time its should run(how many message to print) by calculating the total length of message.
4. iterate over the total length, and inner loop iterate over the map.
5. In inner loop map is iterate in which if encounter with key value 0 the donot print else add stringbuilder object and decrement its value by 1
6. finally return message in the form of string.
