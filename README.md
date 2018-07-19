# java-util-collections-explain
explain for java.util.Collections

## sort(List<T> list)

- `list` 排序
- 实体需要实现 `Comparable` 接口

## sort(List<T> list, Comparator<? super T> c)

- `list` 排序
- 排序规则器 `Comparator`

## binarySearch(List<? extends Comparable<? super T>> list, T key)

- `List` 实现了 `RandomAccess` 接口或者数量小于 `5000` 按照下标查找，其他情况按照迭代器查找。

## binarySearch(List<? extends T> list, T key, Comparator<? super T> c)

- 与 `binarySearch(List<? extends Comparable<? super T>> list, T key)` 不同的是是否有实现排序规则

## reverse(List<?> list)

- `list` 反序
- `List` 实现了 `RandomAccess` 接口或者数量小于 `18` ,循环一半去调换位置的值, 其他情况使用迭代器。

##  shuffle(List<?> list)

- 乱序 `list`
- `List` 实现了 `RandomAccess` 接口或者数量小于 `5`,位置替换,其他情况使用迭代器。

## shuffle(List<?> list, Random rnd)

- 同 `shuffle(List<?> list)` 增加了参数 `Random`