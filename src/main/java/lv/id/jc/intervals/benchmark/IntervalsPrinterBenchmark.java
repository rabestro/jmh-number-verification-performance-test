package lv.id.jc.intervals.benchmark;

import intervals.printer.Binary2Printer;
import intervals.printer.BinaryPrinter;
import intervals.printer.LinearPrinter;
import intervals.printer.Printer;
import intervals.printer.SimplePrinter;
import org.openjdk.jmh.annotations.*;

import java.util.Map;
import java.util.concurrent.TimeUnit;

@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
@Fork(1)
@State(Scope.Benchmark)
public class IntervalsPrinterBenchmark {
    private static final int M1 = 1_000_000;

    private final Printer binaryPrinter = new BinaryPrinter();
    private final Printer binary2Printer = new Binary2Printer();
    private final Printer simplePrinter = new SimplePrinter();
    private final Printer linearPrinter = new LinearPrinter();

    private Map<String, int[]> data;
    @Param({"   10M", "    1M", "  500K", "  100K", "10,000", " 1,000", "   100", "    10", "     5"})
    private String intervalsIn100M;

    @Setup
    public void generateTestData() {
        data = Map.of(
                "   10M", new NumbersProvider(M1, 10_000_000).get(),
                "    1M", new NumbersProvider(M1, 1_000_000).get(),
                "  500K", new NumbersProvider(M1, 500_000).get(),
                "  100K", new NumbersProvider(M1, 100_000).get(),
                "10,000", new NumbersProvider(M1, 10_000).get(),
                " 1,000", new NumbersProvider(M1, 1000).get(),
                "   100", new NumbersProvider(M1, 100).get(),
                "    10", new NumbersProvider(M1, 10).get(),
                "     5", new NumbersProvider(M1, 5).get()
        );
    }

    @Benchmark
    public String binaryAlgorithm() {
        return binaryPrinter.print(data.get(intervalsIn100M));
    }

    @Benchmark
    public String binary2Algorithm() {
        return binary2Printer.print(data.get(intervalsIn100M));
    }

    @Benchmark
    public String simpleAlgorithm() {
        return simplePrinter.print(data.get(intervalsIn100M));
    }

//    @Benchmark
//    public String linearAlgorithm() {
//        return linearPrinter.print(data.get(type));
//    }

}
