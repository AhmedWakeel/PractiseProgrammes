package com.instance.checking;

class M
{
	String string;
	 M(String string)
	 {
		 this.string = string;
	 }
	 public ProductModel getBaseProduct()
		{
			return new ProductModel("M");
		}
}


 class ProductModel extends M {
	 
	 String string;
	 ProductModel(String string)
	 {
		 super(string);
		 this.string = string;
	 }

	 public ProductModel getBaseProduct1()
		{
			return new ProductModel("ProductModel");
		}
}

class VariantProductModel extends ProductModel
{
	VariantProductModel(String string) {
		super(string);
	}

	public ProductModel getBaseProduct1()
	{
		return new VariantProductModel("VariantProductModel");
	}
	
}

class ApparelSizeVariantProductModel extends VariantProductModel
{
	ApparelSizeVariantProductModel(String string) {
		super(string);
	}

	public ProductModel getBaseProduct1()
	{
		return new ProductModel("ApparelSizeVariantProductModel");
	}
}

class D
{
	public ProductModel getBaseProduct(ProductModel model)
	{
		ProductModel model2 = model;
    	if(model instanceof ApparelSizeVariantProductModel)	
    	{
    		model2=((VariantProductModel)model2).getBaseProduct();
    	}
    	if(model2 instanceof VariantProductModel)
    	{
    		model=((VariantProductModel)model).getBaseProduct();
    	}
    	return model;
	}
}

class Main
{
	public static void main(String[] args)
	{
		ProductModel model = new ApparelSizeVariantProductModel("ApparelSizeVariantProductModelInMain");
		D d = new D();
		ProductModel baseProduct = d.getBaseProduct(model);
		System.out.println(baseProduct.string);
	}
}