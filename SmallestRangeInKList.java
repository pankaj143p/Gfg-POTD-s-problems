class Solution {
public:
    vector<int> findSmallestRange(vector<vector<int>>& arr) {
        int n = arr.size();    // number of rows (k lists)
        int m = arr[0].size(); // number of elements in each row

        // Min-heap to store the current minimum element from each list
        // Pair structure: {element_value, {row_index, column_index}}
        priority_queue<pair<int, pair<int, int>>,
                       vector<pair<int, pair<int, int>>>,
                       greater<>> minHeap;

        int maxVal   = INT_MIN; // To track the current maximum among heap elements
        int maxEl    = -1;      // Final max of the smallest range
        int minEl    = -1;      // Final min of the smallest range
        int minRange = INT_MAX; // Initialize minRange to maximum possible

        // Initialize heap with first element from each list and update maxVal
        for (int i = 0; i < n; i++) {
            minHeap.push({ arr[i][0], { i, 0 } });
            maxVal = max(maxVal, arr[i][0]); // Update the maximum value so far
        }

        // Iterate until we reach the end of any list
        while (true) {
            auto top = minHeap.top(); // Get the smallest current element
            minHeap.pop();

            int minVal = top.first;         // Current minimum value
            int row    = top.second.first;  // Row of the min element
            int col    = top.second.second; // Column of the min element

            // Update the range if current [minVal, maxVal] is smaller
            if (maxVal - minVal < minRange) {
                minRange = maxVal - minVal;
                minEl    = minVal;
                maxEl    = maxVal;
            }

            // If this list is exhausted, we can't find further complete ranges
            if (col + 1 == m) {
                break;
            }

            // Push the next element from the same row into the heap
            int nextVal = arr[row][col + 1];
            minHeap.push({ nextVal, { row, col + 1 } });

            // Update maxVal if needed
            maxVal = max(maxVal, nextVal);
        }

        return { minEl, maxEl }; // Return the smallest range
    }
};
