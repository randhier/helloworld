package world

class World(_id: Int, _name: String) {
  // World is the primary "domain" type in this application. Yes,
  // it is very contrived, but as this application grows, it will
  // become a very important concept. Note that there is a much
  // terser syntax available in scala; here it is expanded for clarity.
  def id: Int = _id
  def name: String = _name
}