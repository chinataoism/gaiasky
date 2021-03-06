# This script tests the star size commands.
# Created by Toni Sagrista

from py4j.java_gateway import JavaGateway, GatewayParameters

gateway = JavaGateway(gateway_parameters=GatewayParameters(auto_convert=True))
gs = gateway.entry_point

gs.maximizeInterfaceWindow()

gs.setMinStarOpacity(100.0)
gs.sleep(2)
gs.setMinStarOpacity(70.0)
gs.sleep(2)
gs.setMinStarOpacity(50.0)
gs.sleep(2)
gs.setMinStarOpacity(30.0)
gs.sleep(2)
gs.setMinStarOpacity(12.0)
gs.sleep(2)
gs.setMinStarOpacity(0.0)

gateway.close()