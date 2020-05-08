/* 
 * DBA 2020
 *
 * semestral work
 *
 * OpenAPI spec version: 1.0.0
 * 
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

using System;
using System.IO;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Reflection;
using RestSharp;
using NUnit.Framework;

using IO.Swagger.Client;
using IO.Swagger.Api;
using IO.Swagger.Model;

namespace IO.Swagger.Test
{
    /// <summary>
    ///  Class for testing DeviceEntityEntityApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by Swagger Codegen.
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    [TestFixture]
    public class DeviceEntityEntityApiTests
    {
        private DeviceEntityEntityApi instance;

        /// <summary>
        /// Setup before each unit test
        /// </summary>
        [SetUp]
        public void Init()
        {
            instance = new DeviceEntityEntityApi();
        }

        /// <summary>
        /// Clean up after each unit test
        /// </summary>
        [TearDown]
        public void Cleanup()
        {

        }

        /// <summary>
        /// Test an instance of DeviceEntityEntityApi
        /// </summary>
        [Test]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsInstanceOfType' DeviceEntityEntityApi
            //Assert.IsInstanceOfType(typeof(DeviceEntityEntityApi), instance, "instance is a DeviceEntityEntityApi");
        }

        
        /// <summary>
        /// Test DeleteDeviceEntityUsingDELETE
        /// </summary>
        [Test]
        public void DeleteDeviceEntityUsingDELETETest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //long? id = null;
            //instance.DeleteDeviceEntityUsingDELETE(id);
            
        }
        
        /// <summary>
        /// Test DeviceEntityMachineEntityUsingDELETE
        /// </summary>
        [Test]
        public void DeviceEntityMachineEntityUsingDELETETest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //long? id = null;
            //instance.DeviceEntityMachineEntityUsingDELETE(id);
            
        }
        
        /// <summary>
        /// Test DeviceEntityMachineEntityUsingGET
        /// </summary>
        [Test]
        public void DeviceEntityMachineEntityUsingGETTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //long? id = null;
            //var response = instance.DeviceEntityMachineEntityUsingGET(id);
            //Assert.IsInstanceOf<EntityModelMachineEntity> (response, "response is EntityModelMachineEntity");
        }
        
        /// <summary>
        /// Test DeviceEntityMachineEntityUsingPATCH
        /// </summary>
        [Test]
        public void DeviceEntityMachineEntityUsingPATCHTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string body = null;
            //long? id = null;
            //var response = instance.DeviceEntityMachineEntityUsingPATCH(body, id);
            //Assert.IsInstanceOf<EntityModelMachineEntity> (response, "response is EntityModelMachineEntity");
        }
        
        /// <summary>
        /// Test DeviceEntityMachineEntityUsingPOST
        /// </summary>
        [Test]
        public void DeviceEntityMachineEntityUsingPOSTTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string body = null;
            //long? id = null;
            //var response = instance.DeviceEntityMachineEntityUsingPOST(body, id);
            //Assert.IsInstanceOf<EntityModelMachineEntity> (response, "response is EntityModelMachineEntity");
        }
        
        /// <summary>
        /// Test DeviceEntityMachineEntityUsingPUT
        /// </summary>
        [Test]
        public void DeviceEntityMachineEntityUsingPUTTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string body = null;
            //long? id = null;
            //var response = instance.DeviceEntityMachineEntityUsingPUT(body, id);
            //Assert.IsInstanceOf<EntityModelMachineEntity> (response, "response is EntityModelMachineEntity");
        }
        
        /// <summary>
        /// Test FindAllByMachineEntityIsNullDeviceEntityUsingGET
        /// </summary>
        [Test]
        public void FindAllByMachineEntityIsNullDeviceEntityUsingGETTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //var response = instance.FindAllByMachineEntityIsNullDeviceEntityUsingGET();
            //Assert.IsInstanceOf<CollectionModelDeviceEntity> (response, "response is CollectionModelDeviceEntity");
        }
        
        /// <summary>
        /// Test FindAllDeviceEntityUsingGET
        /// </summary>
        [Test]
        public void FindAllDeviceEntityUsingGETTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //int? page = null;
            //int? size = null;
            //string sort = null;
            //var response = instance.FindAllDeviceEntityUsingGET(page, size, sort);
            //Assert.IsInstanceOf<CollectionModelDeviceEntity> (response, "response is CollectionModelDeviceEntity");
        }
        
        /// <summary>
        /// Test FindByIdDeviceEntityUsingGET
        /// </summary>
        [Test]
        public void FindByIdDeviceEntityUsingGETTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //long? id = null;
            //var response = instance.FindByIdDeviceEntityUsingGET(id);
            //Assert.IsInstanceOf<EntityModelDeviceEntity> (response, "response is EntityModelDeviceEntity");
        }
        
        /// <summary>
        /// Test SaveDeviceEntityUsingPATCH
        /// </summary>
        [Test]
        public void SaveDeviceEntityUsingPATCHTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //DeviceEntity body = null;
            //long? id = null;
            //var response = instance.SaveDeviceEntityUsingPATCH(body, id);
            //Assert.IsInstanceOf<EntityModelDeviceEntity> (response, "response is EntityModelDeviceEntity");
        }
        
        /// <summary>
        /// Test SaveDeviceEntityUsingPOST
        /// </summary>
        [Test]
        public void SaveDeviceEntityUsingPOSTTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //DeviceEntity body = null;
            //var response = instance.SaveDeviceEntityUsingPOST(body);
            //Assert.IsInstanceOf<EntityModelDeviceEntity> (response, "response is EntityModelDeviceEntity");
        }
        
        /// <summary>
        /// Test SaveDeviceEntityUsingPUT
        /// </summary>
        [Test]
        public void SaveDeviceEntityUsingPUTTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //DeviceEntity body = null;
            //long? id = null;
            //var response = instance.SaveDeviceEntityUsingPUT(body, id);
            //Assert.IsInstanceOf<EntityModelDeviceEntity> (response, "response is EntityModelDeviceEntity");
        }
        
    }

}
