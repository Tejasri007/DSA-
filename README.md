# Quadtree Versus SpatialHash

This utility program tests whether Spatial Hashing or Quad Trees have a faster overall performance and helps a programmer choose between the two algorithms. This includes a result visualizer, timing logger, and other similar tools.
![WhatsApp Image 2023-06-28 at 10 15 57 PM (1)](https://github.com/Tejasri007/QUAD-TREES-VERSUS-SPATIAL-HASHING/assets/130212732/d186ee52-b06e-40ca-b766-d01e0543880b)


### How To Use

There are three key components to getting this program to run and benchmarking the two algorithms. 

1. Create the data by executing [`DataGeneration.java`](/src/org/dasd/ee/DataGeneration.java)
   - First, it will ask for the *maximum samples* for the maximum amount of entities to test. It will then generate tests with entities from 1 to the max.
   - Then it will ask how many *tests per sample* giving you a more accurate representation per quantity of entities as you increase. 
   - *Test area* is the size of the square of the entities to be placed on.
   - *Object size* is the size of each entity
   - Finally, a test file will be made that can be shared and passed around to know what data was tested against. It is also used to allow resuming of tests
2.  Benchmark by running [`Benchmark.java`](/src/org/dasd/ee/Benchmark.java)
   - After choosing the algorithm to test, it will export the data required to review the results.
   - This program is single-threaded, so it is essential to run it on a computer with a powerful process
   - The results will be exported in a similarly labeled `.CSV`
3. Review results with [`ReviewResults.java`](/src/org/dasd/ee/ReviewResults.java)
   - This is not required to test data properly but provides insight into how the algorithm works
   - Once you select the test you can view any result of any test.

### Reference
[here](https://brandonbarker.me/downloads/quadtree_spatialhash.pdf). The paper goes over the time complexities of both algorithms, limitations, advantages, and situations when to use each algorithm.

### Libraries and Tools Used

- [GSON](https://github.com/google/gson) - For serialization of test data
- [JGoodies Form Layout](http://www.jgoodies.com/freeware/libraries/forms/) - Review result layout file
- [Lombok](https://projectlombok.org/) - Easy setter and getter generation
