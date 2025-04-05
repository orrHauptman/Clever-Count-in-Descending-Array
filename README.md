# Clever Count in Descending Array

This project provides a clean and efficient way to count how many times an integer appears in a **descending sorted array** — without looping or scanning the entire array.

## 💡 How It Works

To count the number of times a number appears, we need to:
1. Find the **last index** where the number *would* appear.
2. Find the **first index** where the number *would* appear.
3. Subtract the two — that's how many times it appears.

The clever part lies in the way we use **binary search**. Instead of searching for the number directly, we:
- Call a binary search with `num + 0.5`
- Call the same binary search with `num - 0.5`

Since the array contains only integers, those decimal values will never match anything in the array. The binary search returns the **insertion point**, which we use to calculate the count.

This method avoids scanning and achieves a clean `O(log n)` runtime.
