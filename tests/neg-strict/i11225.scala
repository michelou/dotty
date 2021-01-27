import compiletime.notInitialized

class Memo[A](x: => A):
  private var cached: A = _ // error
  private var known: Boolean = false
  def force =
    if !known then
      known = true
      cached = x
    cached
