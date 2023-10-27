import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Interval {
    int start, end;

    Interval() {
        start = 0;
        end = 0;
    }

    Interval(int s, int e) {
        start = s;
        end = e;
    }
}

public class MergeIntervals {
    public static List<Interval> merge(List<Interval> intervals) {
        if (intervals == null || intervals.isEmpty()) {
            return new ArrayList<>();
        }

        intervals.sort(Comparator.comparingInt(a -> a.start));

        List<Interval> result = new ArrayList<>();
        result.add(intervals.get(0));

        for (int i = 1; i < intervals.size(); i++) {
            Interval current = intervals.get(i);
            Interval last = result.get(result.size() - 1);

            if (last.end >= current.start) {
                last.end = Math.max(last.end, current.end);
            } else {
                result.add(current);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        List<Interval> intervals = Arrays.asList(new Interval(1, 3), new Interval(2, 6), new Interval(8, 10), new Interval(15, 18));

        List<Interval> merged = merge(intervals);

        for (Interval interval : merged) {
            System.out.print("[" + interval.start + ", " + interval.end + "] ");
        }
    }
}
