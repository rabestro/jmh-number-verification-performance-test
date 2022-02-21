### Run complete. Total time: 00:43:17

REMEMBER: The numbers below are just data. To gain reusable insights, you need to follow up on why the numbers are the
way they are. Use profilers (see -prof, -lprof), design factorial experiments, perform baseline and negative tests that
provide experimental control, make sure the benchmarking environment is safe on JVM/OS/HW level, ask for reviews from
the domain experts. Do not assume the numbers tell you what you want them to tell.

NOTE: Current JVM experimentally supports Compiler Blackholes, and they are in use. Please exercise extra caution when
trusting the results, look into the generated code to check the benchmark still works, and factor in a small probability
of new VM bugs. Additionally, while comparisons between different JVMs are already problematic, the performance
difference caused by different Blackhole modes can be very significant. Please make sure you use the consistent
Blackhole mode for comparisons.

> **Note**
> The first number in sequence type is the length of sequence and the second number is average length of intervals.

```text
Benchmark                                   (sequenceType)  Mode  Cnt          Score          Error  Units
IntervalsPrinterBenchmark.binary2Algorithm            20/5  avgt    5        686.956 ±      116.312  ns/op
IntervalsPrinterBenchmark.binary2Algorithm          100/10  avgt    5       1860.871 ±       21.278  ns/op
IntervalsPrinterBenchmark.binary2Algorithm           1K/10  avgt    5      14767.736 ±     8166.054  ns/op
IntervalsPrinterBenchmark.binary2Algorithm          10K/10  avgt    5     208926.576 ±     1627.403  ns/op
IntervalsPrinterBenchmark.binary2Algorithm         100K/10  avgt    5    2835274.217 ±    33938.944  ns/op
IntervalsPrinterBenchmark.binary2Algorithm           1M/10  avgt    5   41411006.168 ± 10384190.633  ns/op
IntervalsPrinterBenchmark.binary2Algorithm          10M/10  avgt    5  387211394.569 ±  4408509.951  ns/op
IntervalsPrinterBenchmark.binary2Algorithm        100M/100  avgt    5  621156892.035 ±  5620716.069  ns/op
IntervalsPrinterBenchmark.binaryAlgorithm             20/5  avgt    5        572.765 ±        3.690  ns/op
IntervalsPrinterBenchmark.binaryAlgorithm           100/10  avgt    5       1167.083 ±        4.103  ns/op
IntervalsPrinterBenchmark.binaryAlgorithm            1K/10  avgt    5      16772.818 ±     3330.840  ns/op
IntervalsPrinterBenchmark.binaryAlgorithm           10K/10  avgt    5     223608.697 ±     3070.854  ns/op
IntervalsPrinterBenchmark.binaryAlgorithm          100K/10  avgt    5    2816279.725 ±    16320.650  ns/op
IntervalsPrinterBenchmark.binaryAlgorithm            1M/10  avgt    5   43522783.901 ± 21107261.616  ns/op
IntervalsPrinterBenchmark.binaryAlgorithm           10M/10  avgt    5  428194842.567 ±  3464521.584  ns/op
IntervalsPrinterBenchmark.binaryAlgorithm         100M/100  avgt    5  640045332.481 ± 69545374.982  ns/op
IntervalsPrinterBenchmark.simpleAlgorithm             20/5  avgt    5        131.186 ±        0.692  ns/op
IntervalsPrinterBenchmark.simpleAlgorithm           100/10  avgt    5        337.848 ±        3.195  ns/op
IntervalsPrinterBenchmark.simpleAlgorithm            1K/10  avgt    5       5352.944 ±     1229.942  ns/op
IntervalsPrinterBenchmark.simpleAlgorithm           10K/10  avgt    5      52030.937 ±      319.225  ns/op
IntervalsPrinterBenchmark.simpleAlgorithm          100K/10  avgt    5     705362.376 ±     1682.320  ns/op
IntervalsPrinterBenchmark.simpleAlgorithm            1M/10  avgt    5   16479011.613 ±   717980.211  ns/op
IntervalsPrinterBenchmark.simpleAlgorithm           10M/10  avgt    5  130842432.431 ±  2029752.942  ns/op
IntervalsPrinterBenchmark.simpleAlgorithm         100M/100  avgt    5  201712437.940 ±  5987293.738  ns/op
```
