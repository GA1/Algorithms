
function Queue() {
  this.data = [];
}

Queue.prototype.enqueue = function(v) {
  this.data.push(v);
}

Queue.prototype.size = function() {
  return this.data.length;
}

Queue.prototype.pop = function() {
  return this.data[this.data.length - 1]
}

Queue.prototype.dequeue = function() {
  return this.data.shift()
}


module.exports.Queue = Queue;