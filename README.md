# java-util-collections-explain
explain for java.util.Collections(JDK 1.8)

## 其他

### sort(List<T> list)

- `list` 排序
- 实体需要实现 `Comparable` 接口

### sort(List<T> list, Comparator<? super T> c)

- `list` 排序
- 排序规则器 `Comparator`

### binarySearch(List<? extends Comparable<? super T>> list, T key)

- `List` 实现了 `RandomAccess` 接口或者数量小于 `5000` 按照下标查找，其他情况按照迭代器查找。

### binarySearch(List<? extends T> list, T key, Comparator<? super T> c)

- 与 `binarySearch(List<? extends Comparable<? super T>> list, T key)` 不同的是是否有实现排序规则

### reverse(List<?> list)

- `list` 反序
- `List` 实现了 `RandomAccess` 接口或者数量小于 `18` ,循环一半去调换位置的值, 其他情况使用迭代器。

###  shuffle(List<?> list)

- 乱序 `list`
- `List` 实现了 `RandomAccess` 接口或者数量小于 `5`,位置替换,其他情况使用迭代器。

### shuffle(List<?> list, Random rnd)

- 同 `shuffle(List<?> list)` 增加了参数 `Random`

### swap(List<?> list, int i, int j)

- 调换元素值的位置

### fill(List<? super T> list, T obj)

- 填充 `List`
- `List` 实现了 `RandomAccess` 接口或者数量小于 `25` 直接填充,其他情况使用迭代器。

### copy(List<? super T> dest, List<? extends T> src)

- 拷贝一个 `List` 的元素到另外一个 `List`
- 源 `List` 长度补得大于目标 `List` 长度
- 源 `List` 长度少于 `10` 或者 源 `List` 和 目标 `List` 都实现了 `RandomAccess` 接口,使用下标直接拷贝设置,其他情况使用迭代器

### min(Collection<? extends T> coll)

- 查询集合内最小值

### min(Collection<? extends T> coll, Comparator<? super T> comp)

- 查询集合内最小值
- 自己实现了比较器

###  max(Collection<? extends T> coll)

- 查询集合内最大值

### max(Collection<? extends T> coll, Comparator<? super T> comp)

- 查询集合内最大值
- 自己实现了比较器

### rotate(List<?> list, int distance)

- 将 `List` 向右移动 `distance` 个位置,负数向左移动.
- `List` 都实现了 `RandomAccess` 接口或者长度小于 `100`,使用硬编码的设置位置的值.其他的递归式的调换,类似归并排序.

### replaceAll(List<T> list, T oldVal, T newVal)

- 替换 `List` 内容为新的值
- `List` 长度小于 `11` 或者实现了 `RandomAccess` 接口,使用下标去查找设置,其他按照迭代器设置.

### indexOfSubList(List<?> source, List<?> target)

- 目标 `List` 是否是 源 `List` 的子集,返回子集的下标.
- 源 `List` 长度少于 `35`, 或者 目标 `List` 和 源 `List` 都实现了 `RandomAccess` 接口, 采用下标形式遍历,其他采用迭代器遍历.

### lastIndexOfSubList(List<?> source, List<?> target)

- 同 `indexOfSubList(List<?> source, List<?> target)`,反向查找

## 不可修改

### unmodifiableCollection(Collection<? extends T> c)

- 返回一个不可修改的集合,不能添加删除元素.

### unmodifiableSet(Set<? extends T> s)

- 返回一个不可修改的 `Set`

### unmodifiableSortedSet(SortedSet<T> s)

- 返回一个不可修改的排序 `Set`

### unmodifiableNavigableSet(NavigableSet<T> s)

- 返回一个不可修改的 `NavigableSet`

### unmodifiableList(List<? extends T> list)

- 返回一个不可修改的 `List`

### unmodifiableMap(Map<? extends K, ? extends V> m)

- 返回一个不可修改的 `Map`

### unmodifiableSortedMap(SortedMap<K, ? extends V> m)

- 返回一个不可修改的 `SortedMap`

### unmodifiableNavigableMap(NavigableMap<K, ? extends V> m)

- 返回一个不可修改的 `NavigableMap`

## 加锁

### synchronizedCollection(Collection<T> c)

- 返回一个加锁的集合

### synchronizedCollection(Collection<T> c, Object mutex)

- 返回一个加锁的集合,自己实现锁标志

### synchronizedSet(Set<T> s)

- 返回一个加锁的 `Set`

### synchronizedSet(Set<T> s, Object mutex)

- 返回一个加锁的 `Set`,自己实现锁标志

### synchronizedSortedSet(SortedSet<T> s)

- 返回一个加锁的 `SortedSet`

### synchronizedNavigableSet(NavigableSet<T> s)

- 返回一个加锁的 `NavigableSet`

### synchronizedList(List<T> list)

- 返回一个加锁的 `List`

### synchronizedList(List<T> list, Object mutex)

- 返回一个加锁的 `List`,自己实现锁标志

### synchronizedMap(Map<K,V> m)

- 返回一个加锁的 `Map`

### synchronizedSortedMap(SortedMap<K,V> m)

- 返回一个加锁的 `SortedMap`

### synchronizedNavigableMap(NavigableMap<K,V> m)

- 返回一个加锁的 `NavigableMap`

## 受检查的集合

### checkedCollection(Collection<E> c, Class<E> type)

- 返回一个受检查的集合

### zeroLengthArray(Class<T> type)

- 返回一个零长度的数组

### checkedQueue(Queue<E> queue, Class<E> type)

- 返回一个受检查的 `Queue`

### checkedSet(Set<E> s, Class<E> type)

- 返回一个受检查的 `Set`

### checkedSortedSet(SortedSet<E> s, Class<E> type)

- 返回一个受检查的 `SortedSet`

### checkedNavigableSet(NavigableSet<E> s, Class<E> type)

- 返回一个受检查的 `NavigableSet`

### checkedList(List<E> list, Class<E> type)

- 返回一个受检查的 `List`

### checkedMap(Map<K, V> m, Class<K> keyType, Class<V> valueType)

- 返回一个受检查的 `Map`

### checkedSortedMap(SortedMap<K, V> m, Class<K> keyType, Class<V> valueType)

- 返回一个受检查的 `SortedMap`

### checkedNavigableMap(NavigableMap<K, V> m, Class<K> keyType, Class<V> valueType)

- 返回一个受检查的 `NavigableMap`

## 空值

### emptyIterator()

- 返回一个空的迭代器

### emptyListIterator()

- 返回一个空的 `List` 迭代器

### emptyEnumeration()

- 返回一个空的 `Enumeration` 迭代器

### emptySet()

- 返回一个空的 `Set`

### emptySortedSet()

- 返回一个空的 `SortedSet`

### emptyNavigableSet()

- 返回一个空的 `NavigableSet`

### emptyList()

- 返回一个空的 `List`

### emptyMap()

- 返回一个空的 `Map`

### emptySortedMap

- 返回一个空的 `SortedMap`

### emptyNavigableMap()

- 返回一个空的 `NavigableMap`

## singleton

### singleton(T o)

- 返回只有一个元素的 `Set`

### singletonList(T o)

- 返回只有一个元素的 `List`

### singletonMap(K key, V value

- 返回只有一个元素的 `Map`

## 其他

### nCopies(int n, T o)

- 返回一个填充了同一个元素的 `List`

### reverseOrder()

- 返回一个排序规则器

### reverseOrder(Comparator<T> cmp)

- 返回一个相反的排序规则器

### enumeration(final Collection<T> c)

- 返回一个集合的 `Enumeration`

### list(Enumeration<T> e)

- `Enumeration` 转换成 `ArrayList`

### frequency(Collection<?> c, Object o)

- 统计集合里包含的某个元素个数

### disjoint(Collection<?> c1, Collection<?> c2)

- 集合没有相同的元素

### addAll(Collection<? super T> c, T... elements)

- 向集合添加元素,全部添加成功返回 `true`

### newSetFromMap(Map<E, Boolean> map)

- 方法调用返回的集合的映射支持

### asLifoQueue(Deque<T> deque)

- 方法用于获取一个 `Deque` 视图，作为一个后进先出(`LIFO`)队列

## LICENSE

### [CC-BY-SA-3.0](https://creativecommons.org/licenses/by-nc-sa/3.0/cn/)

[![](LICENSE.png)](https://creativecommons.org/licenses/by-nc-sa/3.0/cn/)