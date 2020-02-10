# Sorting_Algorithms


The project has 3 important classes (RandomCase, ReverseSortedCase, SortedCase) which are responsible to achieve the required outcome. They are supplemented by another class(OperationArray)

OperationArray has 5 functions:

1.	GenerateRandomArray which is used to generate random elements,

2.	PrintUnsortedArray which is used to print unsorted array of elements,

3.	CopyRandomArray which is used to copy for each sorting type,

4.	ReverseSortedArray which is used to reverse sort an array,

5.	TimeTakenFor Sorting which is used to calculate the total time taken to sort an array



In Class SortedCase deals with using the Sorting Algorithms on an already sorted array. First in the class, an object of OperationArray is created which enables it to call its functions GenerateRandomArray and PrintUnsortedArray. After calling these functions an array with random values is created which needs to be sorted in order to feed it as an input to the sorting algorithms. InPlace Quick Sort is used to perform this sorting. An object of InPlaceQuickSort is created which enables us to receive a sorted array. This array as mentioned earlier is fed to the sorting algorithms one by one and the duration of the processing involved is noted using the function of OperationArray.



In class ReverseSortedCase is used to find the runtime of sorting algorithms when the input is reverse sorted. First an object of OperationArray is created which enables us to call the GenerateRandomArray function and the PrintUnsortedArray function. Then we make an object for InPlaceQuickSort and subsequently use the reverseSortedArray function of OperationArray to reverse it. Finally, we feed this array as in input to the sorting algorithms and note their runtime. Every time the array is returned after completion of the sorting algorithm we reverse it and again feed the array. This process is done for all the sorting algorithms within this class



In Class RandomCase we are sorting the array with random numbers and noting down the runtime for each sorting algorithm. To achieve the desired result we create an object of OperationArray and use its methods/functions to GenerateRandomArray, PrintUnsortedArray and copyRandomArray into multiple objects. These objects are fed as input to respective sorting algorithms and the runtime for the algorithm is noted.
