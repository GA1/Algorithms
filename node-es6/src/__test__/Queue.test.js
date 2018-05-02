var x = require('../Queue');

test('empty queue is of size 0', () => {
  var q = new x.Queue()
  expect(q.size()).toEqual(0);
});

test('adding 1 element to an empty queue makes size equals 1', () => {
  var q = new x.Queue()
  q.enqueue(7)
  expect(q.size()).toEqual(1);
});