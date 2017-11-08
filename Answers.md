#lab10 Answers
1. results
2. Try using a TreeMap instead of a HashMap. Does this make any difference?
    treemap causes testing to take longer
3. What happens if you invoke countWords multiple times for different String iterators?
    the iterators would go into the same map
4. What crucial role does the Iterator abstraction play in making WordCounter testable?
    it adds to the map, which allows testing 