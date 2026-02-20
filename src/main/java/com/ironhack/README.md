# IntList Implementations

This project contains an `IntList` interface with two implementations:
- `IntArrayList`
- `IntVector`

## Efficiency Comparison

### When IntArrayList is More Efficient

`IntArrayList` increases its capacity by 50% when full.

This makes it more memory-efficient when:
- You expect moderate growth.
- You want to avoid allocating large unused memory blocks.
- Memory usage is more important than minimizing resize operations.

Example:
If you're storing around 100–200 elements and memory usage matters, `IntArrayList` wastes less space after resizing compared to doubling the size every time.

---

### When IntVector is More Efficient

`IntVector` doubles its capacity when full.

This makes it more time-efficient when:
- You expect rapid or large growth.
- You want to minimize the number of resizing operations.
- Performance during many insertions is more important than memory usage.

Example:
If you're inserting thousands or millions of elements, `IntVector` will resize fewer times than `IntArrayList`, resulting in fewer array copy operations and better overall performance.