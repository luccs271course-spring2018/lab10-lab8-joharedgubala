#lab10 Answers
1. results
    the=33278
    of=18012
    and=12845
    a=12449
    to=12449
    in=9386
    was=7788
    that=6601
    he=6202
    his=5529
2. Try using a TreeMap instead of a HashMap. Does this make any difference?
     treemap causes testing to take longer
3. What happens if you invoke countWords multiple times for different String iterators?
  the iterators would go into the same map
4. What crucial role does the Iterator abstraction play in making WordCounter testable?
    it adds to the map, which allows testing