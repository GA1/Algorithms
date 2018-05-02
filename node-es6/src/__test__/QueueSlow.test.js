var x = require('../QueueSlow');

test('empty queue throws an error if we try to dequeue', () => {
  var q = new x.Queue()
  expect(() => q.dequeue()).toThrow();
})

test('empty queue is of size 0', () => {
  var q = new x.Queue()
  expect(q.size()).toEqual(0);
});

test('enqueue 1 element to an empty queue, check size equals 1', () => {
  var q = new x.Queue()
  q.enqueue(7)
  expect(q.size()).toEqual(1);
});

test('enqueue 2 elements to an empty queue, check size equals 2', () => {
  var q = new x.Queue()
  q.enqueue(7)
  q.enqueue(11)
  expect(q.size()).toEqual(2);
})

test('enqueue 1 element, pop the element', () => {
  var q = new x.Queue()
  q.enqueue(7)
  expect(q.pop()).toEqual(7);
})

test('enqueue 2 elements, pop the last element', () => {
  var q = new x.Queue()
  q.enqueue(7)
  q.enqueue(11)
  expect(q.pop()).toEqual(11);
})


test('enqueue 1 element, dequeue the element', () => {
  var q = new x.Queue()
  q.enqueue(7)
  expect(q.dequeue()).toEqual(7);
})

test('enqueue 2 elements, dequeue both elements', () => {
  var q = new x.Queue()
  q.enqueue(2)
  q.enqueue(5)
  expect(q.dequeue()).toEqual(2);
  expect(q.dequeue()).toEqual(5);
})

test('enqueue 2 elements, dequeue both elements', () => {
  var q = new x.Queue()
  q.enqueue(2)
  q.enqueue(5)
  q.dequeue()
  q.dequeue()
  expect(q.size()).toEqual(0);
})