# Results

### Run complete. Total time: 00:45:20

REMEMBER: The numbers below are just data. To gain reusable insights, you need to follow up on why the numbers are the
way they are. Use profilers (see -prof, -lprof), design factorial experiments, perform baseline and negative tests that
provide experimental control, make sure the benchmarking environment is safe on JVM/OS/HW level, ask for reviews from
the domain experts. Do not assume the numbers tell you what you want them to tell.

NOTE: Current JVM experimentally supports Compiler Blackholes, and they are in use. Please exercise extra caution when
trusting the results, look into the generated code to check the benchmark still works, and factor in a small probability
of new VM bugs. Additionally, while comparisons between different JVMs are already problematic, the performance
difference caused by different Blackhole modes can be very significant. Please make sure you use the consistent
Blackhole mode for comparisons.

```text

Benchmark                                   (intervalsIn100M)  Mode  Cnt          Score          Error  Units
IntervalsPrinterBenchmark.binary2Algorithm                10M  avgt    5  244496744.311 ±  5155554.463  ns/op
IntervalsPrinterBenchmark.binary2Algorithm                 1M  avgt    5  235835305.817 ± 19744027.256  ns/op
IntervalsPrinterBenchmark.binary2Algorithm               500K  avgt    5  159927408.827 ± 40901055.083  ns/op
IntervalsPrinterBenchmark.binary2Algorithm               100K  avgt    5   35423599.494 ±   812800.403  ns/op
IntervalsPrinterBenchmark.binary2Algorithm             10,000  avgt    5    4620618.076 ±   185354.016  ns/op
IntervalsPrinterBenchmark.binary2Algorithm              1,000  avgt    5     499591.648 ±     1754.596  ns/op
IntervalsPrinterBenchmark.binary2Algorithm                100  avgt    5      48349.409 ±      456.571  ns/op
IntervalsPrinterBenchmark.binary2Algorithm                 10  avgt    5       8194.854 ±       39.871  ns/op
IntervalsPrinterBenchmark.binary2Algorithm                  5  avgt    5       1364.056 ±        7.001  ns/op
IntervalsPrinterBenchmark.binaryAlgorithm                 10M  avgt    5  246599863.286 ± 14315011.163  ns/op
IntervalsPrinterBenchmark.binaryAlgorithm                  1M  avgt    5  248860978.851 ± 27383092.339  ns/op
IntervalsPrinterBenchmark.binaryAlgorithm                500K  avgt    5  159295195.259 ±  5797107.102  ns/op
IntervalsPrinterBenchmark.binaryAlgorithm                100K  avgt    5   36042907.689 ±   646150.217  ns/op
IntervalsPrinterBenchmark.binaryAlgorithm              10,000  avgt    5    4619452.490 ±   346303.789  ns/op
IntervalsPrinterBenchmark.binaryAlgorithm               1,000  avgt    5     511820.704 ±     3547.761  ns/op
IntervalsPrinterBenchmark.binaryAlgorithm                 100  avgt    5      50301.703 ±      298.063  ns/op
IntervalsPrinterBenchmark.binaryAlgorithm                  10  avgt    5       9947.395 ±     7200.360  ns/op
IntervalsPrinterBenchmark.binaryAlgorithm                   5  avgt    5       6743.103 ±       16.807  ns/op
IntervalsPrinterBenchmark.simpleAlgorithm                 10M  avgt    5   98858222.808 ±  5834916.628  ns/op
IntervalsPrinterBenchmark.simpleAlgorithm                  1M  avgt    5  100309356.820 ±  6795082.915  ns/op
IntervalsPrinterBenchmark.simpleAlgorithm                500K  avgt    5   64477321.777 ±  6878527.495  ns/op
IntervalsPrinterBenchmark.simpleAlgorithm                100K  avgt    5   12717941.851 ±   627327.316  ns/op
IntervalsPrinterBenchmark.simpleAlgorithm              10,000  avgt    5    1234723.408 ±    16098.001  ns/op
IntervalsPrinterBenchmark.simpleAlgorithm               1,000  avgt    5     666672.505 ±    24825.626  ns/op
IntervalsPrinterBenchmark.simpleAlgorithm                 100  avgt    5     737259.897 ±   783091.901  ns/op
IntervalsPrinterBenchmark.simpleAlgorithm                  10  avgt    5     748693.225 ±   936016.495  ns/op
IntervalsPrinterBenchmark.simpleAlgorithm                   5  avgt    5     631189.339 ±   148119.917  ns/op

Process finished with exit code 0
```
