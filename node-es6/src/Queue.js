
function Queue() {
  this.data = [];
}

Queue.prototype.enqueue = function(v) {
  this.data.push(v);
}

Queue.prototype.size = function() {
  return this.data.length;
}

module.exports.Queue = Queue;
// module.exports.size = size;
// module.exports.Queue = Queue;