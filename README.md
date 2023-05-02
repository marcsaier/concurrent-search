# Concurrent Search
Goal: Realize a concurrent program that stores N random numbers from 0 to N-1 into a List and searches a certain number n. The result is a list of positions, where n was found in the list.

Distribute the work evenly among p threads. The program can be started passing N, n and p via program parameters (args).

Measure the overall running time and print it out at the end of a run.