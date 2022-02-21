package intervals.printer;

import java.util.ArrayDeque;
import java.util.Deque;

import static java.util.stream.Collectors.joining;

class Range2 {
    int first, last;

    Range2(int first, int last) {
        this.first = first;
        this.last = last;
    }

    Range2(int number) {
        this(number, number);
    }

    public String print() {
        return switch (last - first) {
            case 0 -> "" + first;
            case 1 -> first + "," + last;
            default -> first + "-" + last;
        };
    }
}

public class Binary2Printer implements Printer {

    @Override
    public String print(int[] numbers) {
        return new Sequence(numbers).print();
    }

    record Sequence(int[] numbers) {

        String print() {
            var ranges = getRanges(numbers, 0, numbers.length - 1);
            return ranges.stream().map(Range2::print).collect(joining(","));
        }

        private Deque<Range2> getRanges(int[] numbers, int i0, int i1) {
            var sequence = new ArrayDeque<Range2>();
            var firstNumber = numbers[i0];
            var lastNumber = numbers[i1];
            var isSequenceContinues = lastNumber - firstNumber == i1 - i0;

            if (isSequenceContinues) {
                sequence.add(new Range2(firstNumber, lastNumber));
                return sequence;
            }

            var sequenceLength = i1 - i0 + 1;

            if (sequenceLength == 2) {
                sequence.add(new Range2(firstNumber));
                sequence.add(new Range2(lastNumber));
                return sequence;
            }

            var median = i0 + (sequenceLength - 1) / 2;

            var leftRanges = getRanges(numbers, i0, median);
            var rightRanges = getRanges(numbers, median + 1, i1);

            var isConnectable = rightRanges.getFirst().first - leftRanges.getLast().last == 1;

            if (isConnectable) {
                leftRanges.getLast().last = rightRanges.pollFirst().last;
            }
            leftRanges.addAll(rightRanges);
            return leftRanges;
        }

    }
}

