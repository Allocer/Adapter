trait ProductPrice {
  def price: Int
}

class Product {
  var cost = 500
}

class ProductAdapter extends ProductPrice {
  private var product = new Product
  override def price = product.cost
}

class ProductInheritanceAdapter extends Product with ProductPrice {
  override def price = cost
}

object AdapterSample {
  def main(args: Array[String]) = {
    var product1 = new ProductAdapter
    println(product1.price)

    var product2 = new ProductInheritanceAdapter
    println(product2.price)
  }
}

AdapterSample.main(Array())