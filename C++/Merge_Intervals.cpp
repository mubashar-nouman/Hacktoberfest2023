#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

struct Interval {
    int start;
    int end;
    Interval() : start(0), end(0) {}
    Interval(int s, int e) : start(s), end(e) {}
};

bool compareIntervals(const Interval &a, const Interval &b) {
    return a.start < b.start;
}

vector<Interval> mergeIntervals(vector<Interval> &intervals) {
    if (intervals.empty()) {
        return {};
    }

    sort(intervals.begin(), intervals.end(), compareIntervals);

    vector<Interval> result;
    result.push_back(intervals[0]);

    for (int i = 1; i < intervals.size(); ++i) {
        if (result.back().end >= intervals[i].start) {
            result.back().end = max(result.back().end, intervals[i].end);
        } else {
            result.push_back(intervals[i]);
        }
    }

    return result;
}

int main() {
    vector<Interval> intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};

    vector<Interval> merged = mergeIntervals(intervals);

    for (const auto &interval : merged) {
        cout << "[" << interval.start << ", " << interval.end << "] ";
    }

    return 0;
}
