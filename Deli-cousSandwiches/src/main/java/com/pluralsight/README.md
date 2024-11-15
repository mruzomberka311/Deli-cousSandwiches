# Deli-Cous Sandwich Shop

## Description of the Project
In this project, the goal is to make an interactive sandwich shop where a customer may order a fully customizable sandwich.Sandwiches can range in size,
premium toppings, and other included toppings each with a different price based on the size. To help navigate this challenge, some classes integrated
inheritance and abstract classes. The entire process required creating an order, allowing the customer to add to a list of sandwiches, drinks, and chips and then
totaling the price in the end. The receipt that displays the orders contents on the screen and also saves it to a separate file. Overall, the project simulates
a basic POS system. 


- [Up<mxfile host="app.diagrams.net" agent="Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/130.0.0.0 Safari/537.36" version="24.8.4">
  <diagram name="Page-1" id="2s5xlg0eG-wIvAksR5OE">
    <mxGraphModel dx="2463" dy="1839" grid="1" gridSize="10" guides="1" tooltips="1" connect="1" arrows="1" fold="1" page="1" pageScale="1" pageWidth="850" pageHeight="1100" math="0" shadow="0">
      <root>
        <mxCell id="0" />
        <mxCell id="1" parent="0" />
        <mxCell id="VAgajCPK9aDGkY_xGZba-107" style="edgeStyle=orthogonalEdgeStyle;rounded=0;orthogonalLoop=1;jettySize=auto;html=1;exitX=1;exitY=0.5;exitDx=0;exitDy=0;" edge="1" parent="1" source="VAgajCPK9aDGkY_xGZba-1">
          <mxGeometry relative="1" as="geometry">
            <mxPoint x="110" y="249.57894736842104" as="targetPoint" />
          </mxGeometry>
        </mxCell>
        <mxCell id="VAgajCPK9aDGkY_xGZba-1" value="UserInterface" style="swimlane;whiteSpace=wrap;html=1;" vertex="1" parent="1">
          <mxGeometry x="-380" y="85" width="340" height="330" as="geometry" />
        </mxCell>
        <mxCell id="VAgajCPK9aDGkY_xGZba-63" value="public void displayMenu()&lt;div&gt;&lt;br&gt;&lt;/div&gt;&lt;div&gt;public void addOrder()&lt;/div&gt;&lt;div&gt;&lt;br&gt;&lt;/div&gt;&lt;div&gt;public Order getOrder()&lt;/div&gt;&lt;div&gt;&lt;br&gt;&lt;/div&gt;&lt;div&gt;&lt;br&gt;&lt;/div&gt;&lt;div&gt;&lt;br&gt;&lt;/div&gt;&lt;div&gt;&amp;nbsp;&lt;/div&gt;" style="text;html=1;align=left;verticalAlign=middle;whiteSpace=wrap;rounded=0;" vertex="1" parent="VAgajCPK9aDGkY_xGZba-1">
          <mxGeometry y="85" width="290" height="30" as="geometry" />
        </mxCell>
        <mxCell id="VAgajCPK9aDGkY_xGZba-80" style="edgeStyle=orthogonalEdgeStyle;rounded=0;orthogonalLoop=1;jettySize=auto;html=1;exitX=1;exitY=0.5;exitDx=0;exitDy=0;entryX=0;entryY=0.5;entryDx=0;entryDy=0;" edge="1" parent="1" source="VAgajCPK9aDGkY_xGZba-2" target="VAgajCPK9aDGkY_xGZba-10">
          <mxGeometry relative="1" as="geometry" />
        </mxCell>
        <mxCell id="VAgajCPK9aDGkY_xGZba-81" style="edgeStyle=orthogonalEdgeStyle;rounded=0;orthogonalLoop=1;jettySize=auto;html=1;exitX=1;exitY=0.5;exitDx=0;exitDy=0;entryX=0;entryY=0.75;entryDx=0;entryDy=0;" edge="1" parent="1" source="VAgajCPK9aDGkY_xGZba-2" target="VAgajCPK9aDGkY_xGZba-9">
          <mxGeometry relative="1" as="geometry" />
        </mxCell>
        <mxCell id="VAgajCPK9aDGkY_xGZba-82" style="edgeStyle=orthogonalEdgeStyle;rounded=0;orthogonalLoop=1;jettySize=auto;html=1;exitX=1;exitY=0.5;exitDx=0;exitDy=0;entryX=0;entryY=0.5;entryDx=0;entryDy=0;" edge="1" parent="1" source="VAgajCPK9aDGkY_xGZba-2" target="VAgajCPK9aDGkY_xGZba-3">
          <mxGeometry relative="1" as="geometry" />
        </mxCell>
        <mxCell id="VAgajCPK9aDGkY_xGZba-2" value="Order" style="swimlane;whiteSpace=wrap;html=1;" vertex="1" parent="1">
          <mxGeometry x="425" y="30" width="400" height="440" as="geometry" />
        </mxCell>
        <mxCell id="VAgajCPK9aDGkY_xGZba-11" value="private String name;&lt;div&gt;private int orderNumber;&lt;/div&gt;&lt;div&gt;private List&amp;lt;Sandwich&amp;gt; sandwiches;&lt;/div&gt;&lt;div&gt;private List&amp;lt;Drinks&amp;gt; drinks;&lt;/div&gt;&lt;div&gt;private&amp;lt;List&amp;gt;chips;&lt;/div&gt;&lt;div&gt;&lt;br&gt;&lt;/div&gt;&lt;div&gt;&lt;br&gt;&lt;/div&gt;&lt;div style=&quot;font-size: 13px;&quot;&gt;&lt;br&gt;&lt;/div&gt;" style="text;html=1;align=left;verticalAlign=middle;whiteSpace=wrap;rounded=0;" vertex="1" parent="VAgajCPK9aDGkY_xGZba-2">
          <mxGeometry y="60" width="210" height="70" as="geometry" />
        </mxCell>
        <mxCell id="VAgajCPK9aDGkY_xGZba-12" value="" style="shape=link;html=1;rounded=0;" edge="1" parent="VAgajCPK9aDGkY_xGZba-2">
          <mxGeometry width="100" relative="1" as="geometry">
            <mxPoint y="140" as="sourcePoint" />
            <mxPoint x="400" y="140" as="targetPoint" />
          </mxGeometry>
        </mxCell>
        <mxCell id="VAgajCPK9aDGkY_xGZba-13" value="public Order()&lt;div&gt;&lt;br&gt;&lt;/div&gt;&lt;div&gt;Getters and Setters()&lt;/div&gt;&lt;div&gt;&lt;br&gt;&lt;/div&gt;&lt;div&gt;public void addSandwich()&lt;/div&gt;&lt;div&gt;&lt;br&gt;&lt;/div&gt;&lt;div&gt;public void addDrink();&lt;/div&gt;&lt;div&gt;&lt;br&gt;&lt;/div&gt;&lt;div&gt;public void addChips()&lt;/div&gt;&lt;div&gt;&lt;br&gt;&lt;/div&gt;&lt;div&gt;public void displayOrder()&lt;/div&gt;&lt;div&gt;&lt;br&gt;&lt;/div&gt;&lt;div&gt;public double getTotalPrice()&lt;/div&gt;&lt;div&gt;&lt;br&gt;&lt;/div&gt;&lt;div&gt;&lt;br&gt;&lt;/div&gt;&lt;div&gt;&lt;br&gt;&lt;/div&gt;&lt;div&gt;&lt;br&gt;&lt;div&gt;&lt;br&gt;&lt;/div&gt;&lt;div&gt;&lt;br&gt;&lt;/div&gt;&lt;/div&gt;" style="text;html=1;align=left;verticalAlign=middle;whiteSpace=wrap;rounded=0;" vertex="1" parent="VAgajCPK9aDGkY_xGZba-2">
          <mxGeometry x="20" y="300" width="380" height="30" as="geometry" />
        </mxCell>
        <mxCell id="VAgajCPK9aDGkY_xGZba-77" style="edgeStyle=orthogonalEdgeStyle;rounded=0;orthogonalLoop=1;jettySize=auto;html=1;exitX=1;exitY=0.5;exitDx=0;exitDy=0;entryX=0;entryY=0.5;entryDx=0;entryDy=0;" edge="1" parent="1" source="VAgajCPK9aDGkY_xGZba-3" target="VAgajCPK9aDGkY_xGZba-7">
          <mxGeometry relative="1" as="geometry" />
        </mxCell>
        <mxCell id="VAgajCPK9aDGkY_xGZba-78" style="edgeStyle=orthogonalEdgeStyle;rounded=0;orthogonalLoop=1;jettySize=auto;html=1;exitX=1;exitY=0.5;exitDx=0;exitDy=0;entryX=0;entryY=0.5;entryDx=0;entryDy=0;" edge="1" parent="1" source="VAgajCPK9aDGkY_xGZba-3" target="VAgajCPK9aDGkY_xGZba-5">
          <mxGeometry relative="1" as="geometry" />
        </mxCell>
        <mxCell id="VAgajCPK9aDGkY_xGZba-3" value="Sandwich" style="swimlane;whiteSpace=wrap;html=1;" vertex="1" parent="1">
          <mxGeometry x="1190" y="-310" width="350" height="370" as="geometry" />
        </mxCell>
        <mxCell id="VAgajCPK9aDGkY_xGZba-17" value="private String size;&lt;div&gt;private String breadType;&lt;/div&gt;&lt;div&gt;private List&amp;lt;Toppings&amp;gt; toppings;&lt;/div&gt;&lt;div&gt;private boolean isToasted;&lt;br&gt;&lt;div&gt;&lt;br&gt;&lt;/div&gt;&lt;/div&gt;" style="text;html=1;align=left;verticalAlign=middle;whiteSpace=wrap;rounded=0;" vertex="1" parent="VAgajCPK9aDGkY_xGZba-3">
          <mxGeometry y="60" width="205" height="30" as="geometry" />
        </mxCell>
        <mxCell id="VAgajCPK9aDGkY_xGZba-45" value="" style="shape=link;html=1;rounded=0;" edge="1" parent="VAgajCPK9aDGkY_xGZba-3">
          <mxGeometry width="100" relative="1" as="geometry">
            <mxPoint y="130" as="sourcePoint" />
            <mxPoint x="340" y="130" as="targetPoint" />
          </mxGeometry>
        </mxCell>
        <mxCell id="VAgajCPK9aDGkY_xGZba-46" value="public Sandwich()&lt;div&gt;&lt;br&gt;&lt;/div&gt;&lt;div&gt;Getters and Setters&lt;/div&gt;&lt;div&gt;&lt;br&gt;&lt;/div&gt;&lt;div&gt;public void addBread()&lt;/div&gt;&lt;div&gt;&lt;br&gt;&lt;/div&gt;&lt;div&gt;public void addToppings()&lt;/div&gt;&lt;div&gt;&lt;br&gt;&lt;/div&gt;&lt;div&gt;public void getSandwichPrice()&lt;/div&gt;&lt;div&gt;&lt;br&gt;&lt;/div&gt;&lt;div&gt;public String toString()&lt;/div&gt;&lt;div&gt;&lt;br&gt;&lt;/div&gt;&lt;div&gt;&lt;br&gt;&lt;/div&gt;&lt;div&gt;&lt;br&gt;&lt;/div&gt;&lt;div&gt;&lt;br&gt;&lt;/div&gt;&lt;div&gt;&lt;br&gt;&lt;/div&gt;&lt;div&gt;&lt;br&gt;&lt;/div&gt;&lt;div&gt;&lt;br&gt;&lt;/div&gt;" style="text;html=1;align=left;verticalAlign=middle;whiteSpace=wrap;rounded=0;" vertex="1" parent="VAgajCPK9aDGkY_xGZba-3">
          <mxGeometry y="260" width="305" height="40" as="geometry" />
        </mxCell>
        <mxCell id="VAgajCPK9aDGkY_xGZba-39" style="edgeStyle=orthogonalEdgeStyle;rounded=0;orthogonalLoop=1;jettySize=auto;html=1;exitX=0.5;exitY=1;exitDx=0;exitDy=0;entryX=0.5;entryY=0;entryDx=0;entryDy=0;" edge="1" parent="1" source="VAgajCPK9aDGkY_xGZba-5" target="VAgajCPK9aDGkY_xGZba-18">
          <mxGeometry relative="1" as="geometry" />
        </mxCell>
        <mxCell id="VAgajCPK9aDGkY_xGZba-41" style="edgeStyle=orthogonalEdgeStyle;rounded=0;orthogonalLoop=1;jettySize=auto;html=1;exitX=0.5;exitY=1;exitDx=0;exitDy=0;entryX=0.5;entryY=0;entryDx=0;entryDy=0;" edge="1" parent="1" source="VAgajCPK9aDGkY_xGZba-5" target="VAgajCPK9aDGkY_xGZba-20">
          <mxGeometry relative="1" as="geometry" />
        </mxCell>
        <mxCell id="VAgajCPK9aDGkY_xGZba-42" style="edgeStyle=orthogonalEdgeStyle;rounded=0;orthogonalLoop=1;jettySize=auto;html=1;exitX=0.5;exitY=1;exitDx=0;exitDy=0;entryX=0.5;entryY=0;entryDx=0;entryDy=0;" edge="1" parent="1" source="VAgajCPK9aDGkY_xGZba-5" target="VAgajCPK9aDGkY_xGZba-21">
          <mxGeometry relative="1" as="geometry" />
        </mxCell>
        <mxCell id="VAgajCPK9aDGkY_xGZba-69" style="edgeStyle=orthogonalEdgeStyle;rounded=0;orthogonalLoop=1;jettySize=auto;html=1;exitX=0.5;exitY=1;exitDx=0;exitDy=0;entryX=0.5;entryY=0;entryDx=0;entryDy=0;" edge="1" parent="1" source="VAgajCPK9aDGkY_xGZba-5" target="VAgajCPK9aDGkY_xGZba-19">
          <mxGeometry relative="1" as="geometry" />
        </mxCell>
        <mxCell id="VAgajCPK9aDGkY_xGZba-5" value="Abstract Toppings" style="swimlane;whiteSpace=wrap;html=1;" vertex="1" parent="1">
          <mxGeometry x="2080" y="-75" width="340" height="320" as="geometry" />
        </mxCell>
        <mxCell id="VAgajCPK9aDGkY_xGZba-22" value="private String name;&lt;div&gt;private boolean isIncluded;&lt;/div&gt;&lt;div&gt;&lt;br&gt;&lt;/div&gt;" style="text;html=1;align=left;verticalAlign=middle;whiteSpace=wrap;rounded=0;" vertex="1" parent="VAgajCPK9aDGkY_xGZba-5">
          <mxGeometry x="10" y="45" width="220" height="30" as="geometry" />
        </mxCell>
        <mxCell id="VAgajCPK9aDGkY_xGZba-23" value="" style="shape=link;html=1;rounded=0;" edge="1" parent="VAgajCPK9aDGkY_xGZba-5">
          <mxGeometry width="100" relative="1" as="geometry">
            <mxPoint y="105" as="sourcePoint" />
            <mxPoint x="340" y="105" as="targetPoint" />
          </mxGeometry>
        </mxCell>
        <mxCell id="VAgajCPK9aDGkY_xGZba-24" value="public Topping()&lt;div&gt;&lt;br&gt;&lt;/div&gt;&lt;div&gt;Getters and Setters()&lt;/div&gt;&lt;div&gt;&lt;br&gt;&lt;/div&gt;&lt;div&gt;public double getPrice()&lt;/div&gt;&lt;div&gt;&lt;br&gt;&lt;/div&gt;&lt;div&gt;&lt;br&gt;&lt;/div&gt;&lt;div&gt;&lt;br&gt;&lt;/div&gt;&lt;div&gt;&lt;br&gt;&lt;/div&gt;&lt;div&gt;&lt;br&gt;&lt;/div&gt;&lt;div&gt;&lt;br&gt;&lt;/div&gt;" style="text;html=1;align=left;verticalAlign=middle;whiteSpace=wrap;rounded=0;" vertex="1" parent="VAgajCPK9aDGkY_xGZba-5">
          <mxGeometry y="175" width="300" height="45" as="geometry" />
        </mxCell>
        <mxCell id="VAgajCPK9aDGkY_xGZba-7" value="Bread" style="swimlane;whiteSpace=wrap;html=1;" vertex="1" parent="1">
          <mxGeometry x="2080" y="-460" width="350" height="275" as="geometry" />
        </mxCell>
        <mxCell id="VAgajCPK9aDGkY_xGZba-16" value="private String type;" style="text;html=1;align=left;verticalAlign=middle;whiteSpace=wrap;rounded=0;" vertex="1" parent="VAgajCPK9aDGkY_xGZba-7">
          <mxGeometry x="5" y="35" width="255" height="30" as="geometry" />
        </mxCell>
        <mxCell id="VAgajCPK9aDGkY_xGZba-49" value="" style="shape=link;html=1;rounded=0;" edge="1" parent="VAgajCPK9aDGkY_xGZba-7">
          <mxGeometry width="100" relative="1" as="geometry">
            <mxPoint y="85" as="sourcePoint" />
            <mxPoint x="340" y="85" as="targetPoint" />
          </mxGeometry>
        </mxCell>
        <mxCell id="VAgajCPK9aDGkY_xGZba-50" value="public Bread();&lt;div&gt;&lt;br&gt;&lt;/div&gt;&lt;div&gt;Getters and Setters&lt;/div&gt;&lt;div&gt;&lt;br&gt;&lt;/div&gt;&lt;div&gt;&lt;br&gt;&lt;/div&gt;&lt;div&gt;&lt;br&gt;&lt;/div&gt;&lt;div&gt;&lt;br&gt;&lt;/div&gt;&lt;div&gt;&lt;br&gt;&lt;/div&gt;" style="text;html=1;align=left;verticalAlign=middle;whiteSpace=wrap;rounded=0;" vertex="1" parent="VAgajCPK9aDGkY_xGZba-7">
          <mxGeometry x="5" y="135" width="230" height="30" as="geometry" />
        </mxCell>
        <mxCell id="VAgajCPK9aDGkY_xGZba-9" value="Drinks" style="swimlane;whiteSpace=wrap;html=1;" vertex="1" parent="1">
          <mxGeometry x="1190" y="520" width="280" height="280" as="geometry" />
        </mxCell>
        <mxCell id="VAgajCPK9aDGkY_xGZba-53" value="private String size;&lt;div&gt;private String flavor;&lt;/div&gt;" style="text;html=1;align=left;verticalAlign=middle;whiteSpace=wrap;rounded=0;" vertex="1" parent="VAgajCPK9aDGkY_xGZba-9">
          <mxGeometry x="5" y="40" width="210" height="30" as="geometry" />
        </mxCell>
        <mxCell id="VAgajCPK9aDGkY_xGZba-58" value="" style="shape=link;html=1;rounded=0;width=10;" edge="1" parent="VAgajCPK9aDGkY_xGZba-9">
          <mxGeometry width="100" relative="1" as="geometry">
            <mxPoint y="80" as="sourcePoint" />
            <mxPoint x="280" y="80" as="targetPoint" />
          </mxGeometry>
        </mxCell>
        <mxCell id="VAgajCPK9aDGkY_xGZba-60" value="public Drink()&lt;div&gt;&lt;br&gt;&lt;/div&gt;&lt;div&gt;Getter and Setters&lt;/div&gt;&lt;div&gt;&lt;br&gt;&lt;/div&gt;&lt;div&gt;public double getPrice()&lt;/div&gt;&lt;div&gt;&lt;br&gt;&lt;/div&gt;&lt;div&gt;public String toString()&lt;/div&gt;&lt;div&gt;&lt;br&gt;&lt;/div&gt;&lt;div&gt;&lt;br&gt;&lt;/div&gt;" style="text;html=1;align=left;verticalAlign=middle;whiteSpace=wrap;rounded=0;" vertex="1" parent="VAgajCPK9aDGkY_xGZba-9">
          <mxGeometry x="5" y="140" width="220" height="30" as="geometry" />
        </mxCell>
        <mxCell id="VAgajCPK9aDGkY_xGZba-18" value="Cheese" style="swimlane;whiteSpace=wrap;html=1;" vertex="1" parent="1">
          <mxGeometry x="1730" y="480" width="200" height="200" as="geometry" />
        </mxCell>
        <mxCell id="VAgajCPK9aDGkY_xGZba-25" value="super()" style="text;html=1;align=left;verticalAlign=middle;whiteSpace=wrap;rounded=0;" vertex="1" parent="VAgajCPK9aDGkY_xGZba-18">
          <mxGeometry y="30" width="150" height="30" as="geometry" />
        </mxCell>
        <mxCell id="VAgajCPK9aDGkY_xGZba-26" value="" style="shape=link;html=1;rounded=0;" edge="1" parent="VAgajCPK9aDGkY_xGZba-18">
          <mxGeometry width="100" relative="1" as="geometry">
            <mxPoint y="70" as="sourcePoint" />
            <mxPoint x="200" y="70" as="targetPoint" />
          </mxGeometry>
        </mxCell>
        <mxCell id="VAgajCPK9aDGkY_xGZba-27" value="&lt;br&gt;&lt;div&gt;&lt;br&gt;&lt;/div&gt;&lt;div&gt;&lt;div&gt;public double getPrice()&lt;/div&gt;&lt;div&gt;&lt;br&gt;&lt;/div&gt;&lt;div&gt;&lt;br&gt;&lt;/div&gt;&lt;div&gt;&lt;br&gt;&lt;/div&gt;&lt;/div&gt;" style="text;html=1;align=left;verticalAlign=middle;whiteSpace=wrap;rounded=0;" vertex="1" parent="VAgajCPK9aDGkY_xGZba-18">
          <mxGeometry y="110" width="170" height="30" as="geometry" />
        </mxCell>
        <mxCell id="VAgajCPK9aDGkY_xGZba-19" value="Meat" style="swimlane;whiteSpace=wrap;html=1;" vertex="1" parent="1">
          <mxGeometry x="2025" y="480" width="200" height="200" as="geometry" />
        </mxCell>
        <mxCell id="VAgajCPK9aDGkY_xGZba-29" value="super()&lt;div&gt;&lt;br&gt;&lt;/div&gt;&lt;div&gt;&lt;br&gt;&lt;/div&gt;" style="text;html=1;align=left;verticalAlign=middle;whiteSpace=wrap;rounded=0;" vertex="1" parent="VAgajCPK9aDGkY_xGZba-19">
          <mxGeometry x="5" y="40" width="190" height="30" as="geometry" />
        </mxCell>
        <mxCell id="VAgajCPK9aDGkY_xGZba-30" value="" style="shape=link;html=1;rounded=0;entryX=1;entryY=1;entryDx=0;entryDy=0;" edge="1" parent="VAgajCPK9aDGkY_xGZba-19" target="VAgajCPK9aDGkY_xGZba-29">
          <mxGeometry width="100" relative="1" as="geometry">
            <mxPoint y="70" as="sourcePoint" />
            <mxPoint x="100" y="70" as="targetPoint" />
            <Array as="points">
              <mxPoint x="30" y="70" />
              <mxPoint x="40" y="70" />
            </Array>
          </mxGeometry>
        </mxCell>
        <mxCell id="VAgajCPK9aDGkY_xGZba-31" value="&lt;br&gt;&lt;div&gt;&lt;br&gt;&lt;/div&gt;&lt;div&gt;public double getPrice()&lt;/div&gt;&lt;div&gt;&lt;br&gt;&lt;/div&gt;&lt;div&gt;&lt;br&gt;&lt;/div&gt;&lt;div&gt;&lt;br&gt;&lt;/div&gt;&lt;div&gt;&lt;br&gt;&lt;/div&gt;" style="text;html=1;align=left;verticalAlign=middle;whiteSpace=wrap;rounded=0;" vertex="1" parent="VAgajCPK9aDGkY_xGZba-19">
          <mxGeometry x="5" y="120" width="175" height="30" as="geometry" />
        </mxCell>
        <mxCell id="VAgajCPK9aDGkY_xGZba-20" value="RegularToppings" style="swimlane;whiteSpace=wrap;html=1;" vertex="1" parent="1">
          <mxGeometry x="2340" y="480" width="200" height="200" as="geometry" />
        </mxCell>
        <mxCell id="VAgajCPK9aDGkY_xGZba-33" value="" style="shape=link;html=1;rounded=0;" edge="1" parent="VAgajCPK9aDGkY_xGZba-20">
          <mxGeometry width="100" relative="1" as="geometry">
            <mxPoint y="70" as="sourcePoint" />
            <mxPoint x="200" y="70" as="targetPoint" />
          </mxGeometry>
        </mxCell>
        <mxCell id="VAgajCPK9aDGkY_xGZba-34" value="&lt;br&gt;&lt;div&gt;&lt;br&gt;&lt;/div&gt;&lt;div&gt;&lt;div&gt;public double getPrice()&lt;/div&gt;&lt;div&gt;&lt;br&gt;&lt;/div&gt;&lt;div&gt;&lt;br&gt;&lt;/div&gt;&lt;div&gt;&lt;br style=&quot;&quot;&gt;&lt;/div&gt;&lt;/div&gt;" style="text;html=1;align=left;verticalAlign=middle;whiteSpace=wrap;rounded=0;" vertex="1" parent="VAgajCPK9aDGkY_xGZba-20">
          <mxGeometry y="120" width="180" height="30" as="geometry" />
        </mxCell>
        <mxCell id="VAgajCPK9aDGkY_xGZba-32" value="&lt;span style=&quot;text-align: left; text-wrap-mode: wrap;&quot;&gt;super()&lt;/span&gt;" style="text;html=1;align=center;verticalAlign=middle;resizable=0;points=[];autosize=1;strokeColor=none;fillColor=none;" vertex="1" parent="VAgajCPK9aDGkY_xGZba-20">
          <mxGeometry y="30" width="60" height="30" as="geometry" />
        </mxCell>
        <mxCell id="VAgajCPK9aDGkY_xGZba-21" value="Sauce" style="swimlane;whiteSpace=wrap;html=1;" vertex="1" parent="1">
          <mxGeometry x="2680" y="480" width="210" height="200" as="geometry" />
        </mxCell>
        <mxCell id="VAgajCPK9aDGkY_xGZba-37" value="&lt;br&gt;&lt;div&gt;&lt;br&gt;&lt;/div&gt;&lt;div&gt;public double getPrice()&lt;/div&gt;&lt;div&gt;&lt;br&gt;&lt;/div&gt;&lt;div&gt;&lt;br&gt;&lt;/div&gt;&lt;div&gt;&lt;br&gt;&lt;/div&gt;&lt;div&gt;&lt;br style=&quot;&quot;&gt;&lt;/div&gt;" style="text;html=1;align=left;verticalAlign=middle;whiteSpace=wrap;rounded=0;" vertex="1" parent="VAgajCPK9aDGkY_xGZba-21">
          <mxGeometry y="87.5" width="210" height="95" as="geometry" />
        </mxCell>
        <mxCell id="VAgajCPK9aDGkY_xGZba-36" value="" style="shape=link;html=1;rounded=0;" edge="1" parent="VAgajCPK9aDGkY_xGZba-21">
          <mxGeometry width="100" relative="1" as="geometry">
            <mxPoint y="80" as="sourcePoint" />
            <mxPoint x="200" y="80" as="targetPoint" />
          </mxGeometry>
        </mxCell>
        <mxCell id="VAgajCPK9aDGkY_xGZba-35" value="&lt;span style=&quot;text-align: left; text-wrap-mode: wrap;&quot;&gt;super()&lt;/span&gt;" style="text;html=1;align=center;verticalAlign=middle;resizable=0;points=[];autosize=1;strokeColor=none;fillColor=none;" vertex="1" parent="VAgajCPK9aDGkY_xGZba-21">
          <mxGeometry x="10" y="40" width="60" height="30" as="geometry" />
        </mxCell>
        <mxCell id="VAgajCPK9aDGkY_xGZba-68" style="edgeStyle=orthogonalEdgeStyle;rounded=0;orthogonalLoop=1;jettySize=auto;html=1;exitX=0.75;exitY=0;exitDx=0;exitDy=0;entryX=0.69;entryY=0.002;entryDx=0;entryDy=0;entryPerimeter=0;" edge="1" parent="1" source="VAgajCPK9aDGkY_xGZba-18" target="VAgajCPK9aDGkY_xGZba-18">
          <mxGeometry relative="1" as="geometry" />
        </mxCell>
        <mxCell id="VAgajCPK9aDGkY_xGZba-10" value="Chips" style="swimlane;whiteSpace=wrap;html=1;startSize=23;" vertex="1" parent="1">
          <mxGeometry x="1200" y="110" width="270" height="280" as="geometry" />
        </mxCell>
        <mxCell id="VAgajCPK9aDGkY_xGZba-57" value="private String type;" style="text;html=1;align=left;verticalAlign=middle;whiteSpace=wrap;rounded=0;" vertex="1" parent="VAgajCPK9aDGkY_xGZba-10">
          <mxGeometry x="10" y="30" width="220" height="30" as="geometry" />
        </mxCell>
        <mxCell id="VAgajCPK9aDGkY_xGZba-61" value="" style="shape=link;html=1;rounded=0;" edge="1" parent="VAgajCPK9aDGkY_xGZba-10">
          <mxGeometry width="100" relative="1" as="geometry">
            <mxPoint y="80" as="sourcePoint" />
            <mxPoint x="270" y="80" as="targetPoint" />
          </mxGeometry>
        </mxCell>
        <mxCell id="VAgajCPK9aDGkY_xGZba-62" value="Public Chips()&lt;div&gt;&lt;br&gt;&lt;/div&gt;&lt;div&gt;Getters and Setters&lt;/div&gt;&lt;div&gt;&lt;br&gt;&lt;/div&gt;&lt;div&gt;&lt;br&gt;&lt;/div&gt;&lt;div&gt;public double getPrice()&lt;/div&gt;&lt;div&gt;&lt;br&gt;&lt;/div&gt;&lt;div&gt;public String toString()&lt;/div&gt;" style="text;html=1;align=left;verticalAlign=middle;whiteSpace=wrap;rounded=0;" vertex="1" parent="VAgajCPK9aDGkY_xGZba-10">
          <mxGeometry x="10" y="130" width="250" height="30" as="geometry" />
        </mxCell>
        <mxCell id="VAgajCPK9aDGkY_xGZba-86" style="edgeStyle=orthogonalEdgeStyle;rounded=0;orthogonalLoop=1;jettySize=auto;html=1;exitX=1;exitY=0.5;exitDx=0;exitDy=0;entryX=0;entryY=0.5;entryDx=0;entryDy=0;" edge="1" parent="1" source="VAgajCPK9aDGkY_xGZba-84" target="VAgajCPK9aDGkY_xGZba-1">
          <mxGeometry relative="1" as="geometry" />
        </mxCell>
        <mxCell id="VAgajCPK9aDGkY_xGZba-84" value="SandwichShop" style="swimlane;whiteSpace=wrap;html=1;" vertex="1" parent="1">
          <mxGeometry x="-730" y="150" width="200" height="200" as="geometry" />
        </mxCell>
        <mxCell id="VAgajCPK9aDGkY_xGZba-85" value="main()&lt;div&gt;&lt;div&gt;&lt;br&gt;&lt;div&gt;&lt;br&gt;&lt;/div&gt;&lt;div&gt;&lt;br&gt;&lt;/div&gt;&lt;/div&gt;&lt;/div&gt;" style="text;html=1;align=left;verticalAlign=middle;whiteSpace=wrap;rounded=0;" vertex="1" parent="VAgajCPK9aDGkY_xGZba-84">
          <mxGeometry x="15" y="50" width="170" height="30" as="geometry" />
        </mxCell>
        <mxCell id="VAgajCPK9aDGkY_xGZba-106" style="edgeStyle=orthogonalEdgeStyle;rounded=0;orthogonalLoop=1;jettySize=auto;html=1;exitX=1;exitY=0.5;exitDx=0;exitDy=0;" edge="1" parent="1" source="VAgajCPK9aDGkY_xGZba-89">
          <mxGeometry relative="1" as="geometry">
            <mxPoint x="430" y="265.3684210526317" as="targetPoint" />
          </mxGeometry>
        </mxCell>
        <mxCell id="VAgajCPK9aDGkY_xGZba-89" value="RecieptFileManager" style="swimlane;whiteSpace=wrap;html=1;" vertex="1" parent="1">
          <mxGeometry x="110" y="120" width="220" height="290" as="geometry" />
        </mxCell>
        <mxCell id="VAgajCPK9aDGkY_xGZba-90" value="&lt;br&gt;&lt;div&gt;&lt;br&gt;&lt;/div&gt;&lt;div&gt;public void printReciept()&lt;/div&gt;" style="text;html=1;align=left;verticalAlign=middle;whiteSpace=wrap;rounded=0;" vertex="1" parent="VAgajCPK9aDGkY_xGZba-89">
          <mxGeometry y="50" width="180" height="30" as="geometry" />
        </mxCell>
        <mxCell id="VAgajCPK9aDGkY_xGZba-93" value="Has-a" style="text;html=1;align=center;verticalAlign=middle;whiteSpace=wrap;rounded=0;" vertex="1" parent="1">
          <mxGeometry x="10" y="216" width="60" height="30" as="geometry" />
        </mxCell>
        <mxCell id="VAgajCPK9aDGkY_xGZba-94" value="Has-a" style="text;html=1;align=center;verticalAlign=middle;whiteSpace=wrap;rounded=0;" vertex="1" parent="1">
          <mxGeometry x="-490" y="220" width="60" height="30" as="geometry" />
        </mxCell>
        <mxCell id="VAgajCPK9aDGkY_xGZba-95" value="Has-a" style="text;html=1;align=center;verticalAlign=middle;whiteSpace=wrap;rounded=0;" vertex="1" parent="1">
          <mxGeometry x="340" y="235" width="60" height="30" as="geometry" />
        </mxCell>
        <mxCell id="VAgajCPK9aDGkY_xGZba-96" value="Has-a" style="text;html=1;align=center;verticalAlign=middle;whiteSpace=wrap;rounded=0;" vertex="1" parent="1">
          <mxGeometry x="1060" y="216" width="60" height="30" as="geometry" />
        </mxCell>
        <mxCell id="VAgajCPK9aDGkY_xGZba-97" value="Has-a" style="text;html=1;align=center;verticalAlign=middle;whiteSpace=wrap;rounded=0;" vertex="1" parent="1">
          <mxGeometry x="1060" y="-150" width="60" height="30" as="geometry" />
        </mxCell>
        <mxCell id="VAgajCPK9aDGkY_xGZba-98" value="Has-a" style="text;html=1;align=center;verticalAlign=middle;whiteSpace=wrap;rounded=0;" vertex="1" parent="1">
          <mxGeometry x="1060" y="700" width="60" height="30" as="geometry" />
        </mxCell>
        <mxCell id="VAgajCPK9aDGkY_xGZba-99" value="Has-a" style="text;html=1;align=center;verticalAlign=middle;whiteSpace=wrap;rounded=0;" vertex="1" parent="1">
          <mxGeometry x="1660" y="-150" width="60" height="30" as="geometry" />
        </mxCell>
        <mxCell id="VAgajCPK9aDGkY_xGZba-100" value="Has-a" style="text;html=1;align=center;verticalAlign=middle;whiteSpace=wrap;rounded=0;" vertex="1" parent="1">
          <mxGeometry x="1930" y="-354" width="60" height="30" as="geometry" />
        </mxCell>
        <mxCell id="VAgajCPK9aDGkY_xGZba-101" value="Has-a" style="text;html=1;align=center;verticalAlign=middle;whiteSpace=wrap;rounded=0;" vertex="1" parent="1">
          <mxGeometry x="1930" y="50" width="60" height="30" as="geometry" />
        </mxCell>
        <mxCell id="VAgajCPK9aDGkY_xGZba-102" value="Is-a" style="text;html=1;align=center;verticalAlign=middle;whiteSpace=wrap;rounded=0;" vertex="1" parent="1">
          <mxGeometry x="1850" y="330" width="60" height="30" as="geometry" />
        </mxCell>
        <mxCell id="VAgajCPK9aDGkY_xGZba-103" value="Is-a" style="text;html=1;align=center;verticalAlign=middle;whiteSpace=wrap;rounded=0;" vertex="1" parent="1">
          <mxGeometry x="2160" y="330" width="60" height="30" as="geometry" />
        </mxCell>
        <mxCell id="VAgajCPK9aDGkY_xGZba-104" value="Is-a" style="text;html=1;align=center;verticalAlign=middle;whiteSpace=wrap;rounded=0;" vertex="1" parent="1">
          <mxGeometry x="2340" y="331" width="60" height="30" as="geometry" />
        </mxCell>
        <mxCell id="VAgajCPK9aDGkY_xGZba-105" value="Is-a" style="text;html=1;align=center;verticalAlign=middle;whiteSpace=wrap;rounded=0;" vertex="1" parent="1">
          <mxGeometry x="2630" y="330" width="60" height="30" as="geometry" />
        </mxCell>
      </root>
    </mxGraphModel>
  </diagram>
</mxfile>
loading Updated-Capstone2 diagram.drawio…]()


## User Stories

- As a customer, I would like to be able to have a clear menu of sandwich additions, so I can customize my sandwich.
- As a customer, I would like to add items to my order, and see the total price.
- As a user, I would like to print and save the receipt of a checked out order, so I can have a history of orders.
- As a user I would like to be able to have an efficient way of ordering in case it gets busy.

## Setup

Instructions on how to set up and run the project using IntelliJ IDEA.

### Prerequisites

- IntelliJ IDEA: Ensure you have IntelliJ IDEA installed, which you can download from [here](https://www.jetbrains.com/idea/download/).
- Java SDK: Make sure Java SDK is installed and configured in IntelliJ.

### Running the Application in IntelliJ

Follow these steps to get your application running within IntelliJ IDEA:

1. Open IntelliJ IDEA.
2. Select "Open" and navigate to the directory where you cloned or downloaded the project.
3. After the project opens, wait for IntelliJ to index the files and set up the project.
4. Find the main class with the `public static void main(String[] args)` method.
5. Right-click on the file and select 'Run 'YourMainClassName.main()'' to start the application.

## Technologies Used

- Java version 17 

## Demo


- ![Screenshot (43)](https://github.com/user-attachments/assets/07df11da-1c22-4e13-b14f-6bd5a5b2a63d)
![Screenshot (44)](https://github.com/user-attachments/assets/d775d27a-f8fd-4554-8566-378d3b6b9c7f)
![Screenshot (45)](https://github.com/user-attachments/assets/4a85259b-c7d6-43b8-81de-04e53fec1801)
![Screenshot (46)](https://github.com/user-attachments/assets/8cf73270-9d33-465c-b3a2-8154712db751)
![Screenshot (47)](https://github.com/user-attachments/assets/8300f39a-abd5-4f32-ac1d-0874f7119c47)
![Screenshot (48)](https://github.com/user-attachments/assets/b5810acc-2094-4673-99d1-a11cc4e80096)


## Future Work

- I would have liked to have integrated Enums to simplify the project further.
- Instead of a random order number, have the order number count by 1 and reset every time it reaches 100.
- Overall, I would have liked to make the receipt look nicer. 

## Resources
- https://yearup.brightspace.com/d2l/le/enhancedSequenceViewer/8605?url=https%3A%2F%2Fa8aef0e2-4090-467b-bc7e-c872d64ba733.sequences.api.brightspace.com%2F8605%2Factivity%2F115090%3FfilterOnDatesAndDepth%3D1
- https://www.w3schools.com/java/java_howto_random_number.asp
- https://www.benchresources.net/java-8-find-sum-and-average-of-a-list/#google_vignette
- https://chatgpt.com/c/6734c06b-55fc-8001-a071-4ffb3d3f8838

## Team Members

- Matthew Ruzomberka

## Thanks

- Thank you to Raymond for always providing great guidance and giving projects that ingrain my knowledge further. 
