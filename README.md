# QUAD-TREES-VERSUS-SPATIAL-HASHING
Quadtree Versus SpatialHash
This is a utility program to test whether Spatial Hashing or Quad Trees have a faster overall performance and helping a programmer make a choice between the two algorithms. This includes a result visualizer, timing logger, and other similar tools. 
![WhatsApp Image 2023-06-28 at 10 15 57 PM](https://github.com/Tejasri007/QUAD-TREES-VERSUS-SPATIAL-HASHING/assets/130212732/87e415b1-9977-485a-bafb-d3a2c44a0b40)

How To Use
There are three key components to getting this program to run and getting to benchmarking of the two algorithms.

1.Create the data by executing -----------------
First it will ask for the maximum samples for the maximum amount of entities to test. It will then generate tests with entities from 1 to the max.
Then it will ask how many tests per sample giving you a more accurate representation per quantity of entities as you increase.
Test area is the size of the square of the entities to be placed on.
Object size is the size of each entity
Finally a test file will be made that can be shared and passed around to know what data was tested against. It is also used to allow resuming of tests
2.Benchmark by running ---------------
After choosing what algorithm to test it will export the data required for reviewing the results.
This program is single threaded so it is important to run this it a computer with a powerful process
The results will be exported in a similarly labeled ------
3.Review results with --------------------------
This is not required to properly test data but provides insight into how the algorithm works
Once you select the test you can view any result of any test.
