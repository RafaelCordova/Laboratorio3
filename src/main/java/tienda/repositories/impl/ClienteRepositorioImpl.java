package tienda.repositories.impl;

<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 108d8b2bb3439fc3b21f54a41a9bfa8966b39e34
import com.mongodb.MongoNamespace;
import com.mongodb.ReadConcern;
import com.mongodb.ReadPreference;
import com.mongodb.WriteConcern;
import com.mongodb.bulk.BulkWriteResult;
import com.mongodb.client.*;
import com.mongodb.client.model.*;
import com.mongodb.client.result.DeleteResult;
import com.mongodb.client.result.UpdateResult;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.conversions.Bson;
<<<<<<< HEAD
import tienda.Lab3_Pregunta3.ClienteFlyweight;
import tienda.Lab3_Pregunta3.ClienteFlyweightMain;
=======
>>>>>>> 831e962f4cbcb481952f4526c3cdd0402f4aa8ec
=======
>>>>>>> 108d8b2bb3439fc3b21f54a41a9bfa8966b39e34
import tienda.models.Cliente;
import tienda.repositories.ClienteRepositorio;

import java.util.List;
import java.util.LinkedList;

//import com.mongodb.client.FindIterable;
<<<<<<< HEAD
<<<<<<< HEAD
import static com.mongodb.client.model.Filters.eq;
=======
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.FindOneAndReplaceOptions;
import com.mongodb.client.model.ReturnDocument;
import static com.mongodb.client.model.Filters.eq;

>>>>>>> 831e962f4cbcb481952f4526c3cdd0402f4aa8ec
import org.bson.Document;
import org.bson.types.ObjectId;

public class ClienteRepositorioImpl implements ClienteRepositorio {

<<<<<<< HEAD
    Cliente objCli = new Cliente();

=======
>>>>>>> 831e962f4cbcb481952f4526c3cdd0402f4aa8ec
=======
import static com.mongodb.client.model.Filters.eq;
import org.bson.Document;
import org.bson.types.ObjectId;
import tienda.Lab3_Pregunta3.*;

public class ClienteRepositorioImpl implements ClienteRepositorio {


    Cliente objCli = new Cliente();

>>>>>>> 108d8b2bb3439fc3b21f54a41a9bfa8966b39e34
    private static final String COLLECTION_NAME = "clientes";
    private static final FindOneAndReplaceOptions UPDATE_OPTIONS = new FindOneAndReplaceOptions()
            .returnDocument(ReturnDocument.AFTER);

<<<<<<< HEAD
<<<<<<< HEAD
    //private final MongoCollection<Cliente> clientes;
    private  MongoCollection<Cliente> clientes = new MongoCollection<Cliente>() {
        @Override
        public MongoNamespace getNamespace() {
            return null;
        }

        @Override
        public Class<Cliente> getDocumentClass() {
            return null;
        }

        @Override
        public CodecRegistry getCodecRegistry() {
            return null;
        }

        @Override
        public ReadPreference getReadPreference() {
            return null;
        }

        @Override
        public WriteConcern getWriteConcern() {
            return null;
        }

        @Override
        public ReadConcern getReadConcern() {
            return null;
        }

        @Override
        public <NewTDocument> MongoCollection<NewTDocument> withDocumentClass(Class<NewTDocument> clazz) {
            return null;
        }

        @Override
        public MongoCollection<Cliente> withCodecRegistry(CodecRegistry codecRegistry) {
            return null;
        }

        @Override
        public MongoCollection<Cliente> withReadPreference(ReadPreference readPreference) {
            return null;
        }

        @Override
        public MongoCollection<Cliente> withWriteConcern(WriteConcern writeConcern) {
            return null;
        }

        @Override
        public MongoCollection<Cliente> withReadConcern(ReadConcern readConcern) {
            return null;
        }

        @Override
        public long count() {
            return 0;
        }

        @Override
        public long count(Bson filter) {
            return 0;
        }

        @Override
        public long count(Bson filter, CountOptions options) {
            return 0;
        }

        @Override
        public long count(ClientSession clientSession) {
            return 0;
        }

        @Override
        public long count(ClientSession clientSession, Bson filter) {
            return 0;
        }

        @Override
        public long count(ClientSession clientSession, Bson filter, CountOptions options) {
            return 0;
        }

        @Override
        public long countDocuments() {
            return 0;
        }

        @Override
        public long countDocuments(Bson filter) {
            return 0;
        }

        @Override
        public long countDocuments(Bson filter, CountOptions options) {
            return 0;
        }

        @Override
        public long countDocuments(ClientSession clientSession) {
            return 0;
        }

        @Override
        public long countDocuments(ClientSession clientSession, Bson filter) {
            return 0;
        }

        @Override
        public long countDocuments(ClientSession clientSession, Bson filter, CountOptions options) {
            return 0;
        }

        @Override
        public long estimatedDocumentCount() {
            return 0;
        }

        @Override
        public long estimatedDocumentCount(EstimatedDocumentCountOptions options) {
            return 0;
        }

        @Override
        public <TResult> DistinctIterable<TResult> distinct(String fieldName, Class<TResult> tResultClass) {
            return null;
        }

        @Override
        public <TResult> DistinctIterable<TResult> distinct(String fieldName, Bson filter, Class<TResult> tResultClass) {
            return null;
        }

        @Override
        public <TResult> DistinctIterable<TResult> distinct(ClientSession clientSession, String fieldName, Class<TResult> tResultClass) {
            return null;
        }

        @Override
        public <TResult> DistinctIterable<TResult> distinct(ClientSession clientSession, String fieldName, Bson filter, Class<TResult> tResultClass) {
            return null;
        }

        @Override
        public FindIterable<Cliente> find() {
            return null;
        }

        @Override
        public <TResult> FindIterable<TResult> find(Class<TResult> tResultClass) {
            return null;
        }

        @Override
        public FindIterable<Cliente> find(Bson filter) {
            return null;
        }

        @Override
        public <TResult> FindIterable<TResult> find(Bson filter, Class<TResult> tResultClass) {
            return null;
        }

        @Override
        public FindIterable<Cliente> find(ClientSession clientSession) {
            return null;
        }

        @Override
        public <TResult> FindIterable<TResult> find(ClientSession clientSession, Class<TResult> tResultClass) {
            return null;
        }

        @Override
        public FindIterable<Cliente> find(ClientSession clientSession, Bson filter) {
            return null;
        }

        @Override
        public <TResult> FindIterable<TResult> find(ClientSession clientSession, Bson filter, Class<TResult> tResultClass) {
            return null;
        }

        @Override
        public AggregateIterable<Cliente> aggregate(List<? extends Bson> pipeline) {
            return null;
        }

        @Override
        public <TResult> AggregateIterable<TResult> aggregate(List<? extends Bson> pipeline, Class<TResult> tResultClass) {
            return null;
        }

        @Override
        public AggregateIterable<Cliente> aggregate(ClientSession clientSession, List<? extends Bson> pipeline) {
            return null;
        }

        @Override
        public <TResult> AggregateIterable<TResult> aggregate(ClientSession clientSession, List<? extends Bson> pipeline, Class<TResult> tResultClass) {
            return null;
        }

        @Override
        public ChangeStreamIterable<Cliente> watch() {
            return null;
        }

        @Override
        public <TResult> ChangeStreamIterable<TResult> watch(Class<TResult> tResultClass) {
            return null;
        }

        @Override
        public ChangeStreamIterable<Cliente> watch(List<? extends Bson> pipeline) {
            return null;
        }

        @Override
        public <TResult> ChangeStreamIterable<TResult> watch(List<? extends Bson> pipeline, Class<TResult> tResultClass) {
            return null;
        }

        @Override
        public ChangeStreamIterable<Cliente> watch(ClientSession clientSession) {
            return null;
        }

        @Override
        public <TResult> ChangeStreamIterable<TResult> watch(ClientSession clientSession, Class<TResult> tResultClass) {
            return null;
        }

        @Override
        public ChangeStreamIterable<Cliente> watch(ClientSession clientSession, List<? extends Bson> pipeline) {
            return null;
        }

        @Override
        public <TResult> ChangeStreamIterable<TResult> watch(ClientSession clientSession, List<? extends Bson> pipeline, Class<TResult> tResultClass) {
            return null;
        }

        @Override
        public MapReduceIterable<Cliente> mapReduce(String mapFunction, String reduceFunction) {
            return null;
        }

        @Override
        public <TResult> MapReduceIterable<TResult> mapReduce(String mapFunction, String reduceFunction, Class<TResult> tResultClass) {
            return null;
        }

        @Override
        public MapReduceIterable<Cliente> mapReduce(ClientSession clientSession, String mapFunction, String reduceFunction) {
            return null;
        }

        @Override
        public <TResult> MapReduceIterable<TResult> mapReduce(ClientSession clientSession, String mapFunction, String reduceFunction, Class<TResult> tResultClass) {
            return null;
        }

        @Override
        public BulkWriteResult bulkWrite(List<? extends WriteModel<? extends Cliente>> requests) {
            return null;
        }

        @Override
        public BulkWriteResult bulkWrite(List<? extends WriteModel<? extends Cliente>> requests, BulkWriteOptions options) {
            return null;
        }

        @Override
        public BulkWriteResult bulkWrite(ClientSession clientSession, List<? extends WriteModel<? extends Cliente>> requests) {
            return null;
        }

        @Override
        public BulkWriteResult bulkWrite(ClientSession clientSession, List<? extends WriteModel<? extends Cliente>> requests, BulkWriteOptions options) {
            return null;
        }

        @Override
        public void insertOne(Cliente cliente) {

        }

        @Override
        public void insertOne(Cliente cliente, InsertOneOptions options) {

        }

        @Override
        public void insertOne(ClientSession clientSession, Cliente cliente) {

        }

        @Override
        public void insertOne(ClientSession clientSession, Cliente cliente, InsertOneOptions options) {

        }

        @Override
        public void insertMany(List<? extends Cliente> clientes) {

        }

        @Override
        public void insertMany(List<? extends Cliente> clientes, InsertManyOptions options) {

        }

        @Override
        public void insertMany(ClientSession clientSession, List<? extends Cliente> clientes) {

        }

        @Override
        public void insertMany(ClientSession clientSession, List<? extends Cliente> clientes, InsertManyOptions options) {

        }

        @Override
        public DeleteResult deleteOne(Bson filter) {
            return null;
        }

        @Override
        public DeleteResult deleteOne(Bson filter, DeleteOptions options) {
            return null;
        }

        @Override
        public DeleteResult deleteOne(ClientSession clientSession, Bson filter) {
            return null;
        }

        @Override
        public DeleteResult deleteOne(ClientSession clientSession, Bson filter, DeleteOptions options) {
            return null;
        }

        @Override
        public DeleteResult deleteMany(Bson filter) {
            return null;
        }

        @Override
        public DeleteResult deleteMany(Bson filter, DeleteOptions options) {
            return null;
        }

        @Override
        public DeleteResult deleteMany(ClientSession clientSession, Bson filter) {
            return null;
        }

        @Override
        public DeleteResult deleteMany(ClientSession clientSession, Bson filter, DeleteOptions options) {
            return null;
        }

        @Override
        public UpdateResult replaceOne(Bson filter, Cliente replacement) {
            return null;
        }

        @Override
        public UpdateResult replaceOne(Bson filter, Cliente replacement, UpdateOptions updateOptions) {
            return null;
        }

        @Override
        public UpdateResult replaceOne(Bson filter, Cliente replacement, ReplaceOptions replaceOptions) {
            return null;
        }

        @Override
        public UpdateResult replaceOne(ClientSession clientSession, Bson filter, Cliente replacement) {
            return null;
        }

        @Override
        public UpdateResult replaceOne(ClientSession clientSession, Bson filter, Cliente replacement, UpdateOptions updateOptions) {
            return null;
        }

        @Override
        public UpdateResult replaceOne(ClientSession clientSession, Bson filter, Cliente replacement, ReplaceOptions replaceOptions) {
            return null;
        }

        @Override
        public UpdateResult updateOne(Bson filter, Bson update) {
            return null;
        }

        @Override
        public UpdateResult updateOne(Bson filter, Bson update, UpdateOptions updateOptions) {
            return null;
        }

        @Override
        public UpdateResult updateOne(ClientSession clientSession, Bson filter, Bson update) {
            return null;
        }

        @Override
        public UpdateResult updateOne(ClientSession clientSession, Bson filter, Bson update, UpdateOptions updateOptions) {
            return null;
        }

        @Override
        public UpdateResult updateOne(Bson filter, List<? extends Bson> update) {
            return null;
        }

        @Override
        public UpdateResult updateOne(Bson filter, List<? extends Bson> update, UpdateOptions updateOptions) {
            return null;
        }

        @Override
        public UpdateResult updateOne(ClientSession clientSession, Bson filter, List<? extends Bson> update) {
            return null;
        }

        @Override
        public UpdateResult updateOne(ClientSession clientSession, Bson filter, List<? extends Bson> update, UpdateOptions updateOptions) {
            return null;
        }

        @Override
        public UpdateResult updateMany(Bson filter, Bson update) {
            return null;
        }

        @Override
        public UpdateResult updateMany(Bson filter, Bson update, UpdateOptions updateOptions) {
            return null;
        }

        @Override
        public UpdateResult updateMany(ClientSession clientSession, Bson filter, Bson update) {
            return null;
        }

        @Override
        public UpdateResult updateMany(ClientSession clientSession, Bson filter, Bson update, UpdateOptions updateOptions) {
            return null;
        }

        @Override
        public UpdateResult updateMany(Bson filter, List<? extends Bson> update) {
            return null;
        }

        @Override
        public UpdateResult updateMany(Bson filter, List<? extends Bson> update, UpdateOptions updateOptions) {
            return null;
        }

        @Override
        public UpdateResult updateMany(ClientSession clientSession, Bson filter, List<? extends Bson> update) {
            return null;
        }

        @Override
        public UpdateResult updateMany(ClientSession clientSession, Bson filter, List<? extends Bson> update, UpdateOptions updateOptions) {
            return null;
        }

        @Override
        public Cliente findOneAndDelete(Bson filter) {
            return null;
        }

        @Override
        public Cliente findOneAndDelete(Bson filter, FindOneAndDeleteOptions options) {
            return null;
        }

        @Override
        public Cliente findOneAndDelete(ClientSession clientSession, Bson filter) {
            return null;
        }

        @Override
        public Cliente findOneAndDelete(ClientSession clientSession, Bson filter, FindOneAndDeleteOptions options) {
            return null;
        }

        @Override
        public Cliente findOneAndReplace(Bson filter, Cliente replacement) {
            return null;
        }

        @Override
        public Cliente findOneAndReplace(Bson filter, Cliente replacement, FindOneAndReplaceOptions options) {
            return null;
        }

        @Override
        public Cliente findOneAndReplace(ClientSession clientSession, Bson filter, Cliente replacement) {
            return null;
        }

        @Override
        public Cliente findOneAndReplace(ClientSession clientSession, Bson filter, Cliente replacement, FindOneAndReplaceOptions options) {
            return null;
        }

        @Override
        public Cliente findOneAndUpdate(Bson filter, Bson update) {
            return null;
        }

        @Override
        public Cliente findOneAndUpdate(Bson filter, Bson update, FindOneAndUpdateOptions options) {
            return null;
        }

        @Override
        public Cliente findOneAndUpdate(ClientSession clientSession, Bson filter, Bson update) {
            return null;
        }

        @Override
        public Cliente findOneAndUpdate(ClientSession clientSession, Bson filter, Bson update, FindOneAndUpdateOptions options) {
            return null;
        }

        @Override
        public Cliente findOneAndUpdate(Bson filter, List<? extends Bson> update) {
            return null;
        }

        @Override
        public Cliente findOneAndUpdate(Bson filter, List<? extends Bson> update, FindOneAndUpdateOptions options) {
            return null;
        }

        @Override
        public Cliente findOneAndUpdate(ClientSession clientSession, Bson filter, List<? extends Bson> update) {
            return null;
        }

        @Override
        public Cliente findOneAndUpdate(ClientSession clientSession, Bson filter, List<? extends Bson> update, FindOneAndUpdateOptions options) {
            return null;
        }

        @Override
        public void drop() {

        }

        @Override
        public void drop(ClientSession clientSession) {

        }

        @Override
        public String createIndex(Bson keys) {
            return null;
        }

        @Override
        public String createIndex(Bson keys, IndexOptions indexOptions) {
            return null;
        }

        @Override
        public String createIndex(ClientSession clientSession, Bson keys) {
            return null;
        }

        @Override
        public String createIndex(ClientSession clientSession, Bson keys, IndexOptions indexOptions) {
            return null;
        }

        @Override
        public List<String> createIndexes(List<IndexModel> indexes) {
            return null;
        }

        @Override
        public List<String> createIndexes(List<IndexModel> indexes, CreateIndexOptions createIndexOptions) {
            return null;
        }

        @Override
        public List<String> createIndexes(ClientSession clientSession, List<IndexModel> indexes) {
            return null;
        }

        @Override
        public List<String> createIndexes(ClientSession clientSession, List<IndexModel> indexes, CreateIndexOptions createIndexOptions) {
            return null;
        }

        @Override
        public ListIndexesIterable<Document> listIndexes() {
            return null;
        }

        @Override
        public <TResult> ListIndexesIterable<TResult> listIndexes(Class<TResult> tResultClass) {
            return null;
        }

        @Override
        public ListIndexesIterable<Document> listIndexes(ClientSession clientSession) {
            return null;
        }

        @Override
        public <TResult> ListIndexesIterable<TResult> listIndexes(ClientSession clientSession, Class<TResult> tResultClass) {
            return null;
        }

        @Override
        public void dropIndex(String indexName) {

        }

        @Override
        public void dropIndex(String indexName, DropIndexOptions dropIndexOptions) {

        }

        @Override
        public void dropIndex(Bson keys) {

        }

        @Override
        public void dropIndex(Bson keys, DropIndexOptions dropIndexOptions) {

        }

        @Override
        public void dropIndex(ClientSession clientSession, String indexName) {

        }

        @Override
        public void dropIndex(ClientSession clientSession, Bson keys) {

        }

        @Override
        public void dropIndex(ClientSession clientSession, String indexName, DropIndexOptions dropIndexOptions) {

        }

        @Override
        public void dropIndex(ClientSession clientSession, Bson keys, DropIndexOptions dropIndexOptions) {

        }

        @Override
        public void dropIndexes() {

        }

        @Override
        public void dropIndexes(ClientSession clientSession) {

        }

        @Override
        public void dropIndexes(DropIndexOptions dropIndexOptions) {

        }

        @Override
        public void dropIndexes(ClientSession clientSession, DropIndexOptions dropIndexOptions) {

        }

        @Override
        public void renameCollection(MongoNamespace newCollectionNamespace) {

        }

        @Override
        public void renameCollection(MongoNamespace newCollectionNamespace, RenameCollectionOptions renameCollectionOptions) {

        }

        @Override
        public void renameCollection(ClientSession clientSession, MongoNamespace newCollectionNamespace) {

        }

        @Override
        public void renameCollection(ClientSession clientSession, MongoNamespace newCollectionNamespace, RenameCollectionOptions renameCollectionOptions) {

        }
    };

    public static List<Cliente>lista = new LinkedList();

    public ClienteRepositorioImpl() {
    }
=======
    private final MongoCollection<Cliente> clientes;
>>>>>>> 831e962f4cbcb481952f4526c3cdd0402f4aa8ec
=======
  //  private final MongoCollection<Cliente> clientes;
    public MongoCollection<Cliente> clientes = new MongoCollection<Cliente>() {
      @Override
      public MongoNamespace getNamespace() {
          return null;
      }

      @Override
      public Class<Cliente> getDocumentClass() {
          return null;
      }

      @Override
      public CodecRegistry getCodecRegistry() {
          return null;
      }

      @Override
      public ReadPreference getReadPreference() {
          return null;
      }

      @Override
      public WriteConcern getWriteConcern() {
          return null;
      }

      @Override
      public ReadConcern getReadConcern() {
          return null;
      }

      @Override
      public <NewTDocument> MongoCollection<NewTDocument> withDocumentClass(Class<NewTDocument> clazz) {
          return null;
      }

      @Override
      public MongoCollection<Cliente> withCodecRegistry(CodecRegistry codecRegistry) {
          return null;
      }

      @Override
      public MongoCollection<Cliente> withReadPreference(ReadPreference readPreference) {
          return null;
      }

      @Override
      public MongoCollection<Cliente> withWriteConcern(WriteConcern writeConcern) {
          return null;
      }

      @Override
      public MongoCollection<Cliente> withReadConcern(ReadConcern readConcern) {
          return null;
      }

      @Override
      public long count() {
          return 0;
      }

      @Override
      public long count(Bson filter) {
          return 0;
      }

      @Override
      public long count(Bson filter, CountOptions options) {
          return 0;
      }

      @Override
      public long count(ClientSession clientSession) {
          return 0;
      }

      @Override
      public long count(ClientSession clientSession, Bson filter) {
          return 0;
      }

      @Override
      public long count(ClientSession clientSession, Bson filter, CountOptions options) {
          return 0;
      }

      @Override
      public long countDocuments() {
          return 0;
      }

      @Override
      public long countDocuments(Bson filter) {
          return 0;
      }

      @Override
      public long countDocuments(Bson filter, CountOptions options) {
          return 0;
      }

      @Override
      public long countDocuments(ClientSession clientSession) {
          return 0;
      }

      @Override
      public long countDocuments(ClientSession clientSession, Bson filter) {
          return 0;
      }

      @Override
      public long countDocuments(ClientSession clientSession, Bson filter, CountOptions options) {
          return 0;
      }

      @Override
      public long estimatedDocumentCount() {
          return 0;
      }

      @Override
      public long estimatedDocumentCount(EstimatedDocumentCountOptions options) {
          return 0;
      }

      @Override
      public <TResult> DistinctIterable<TResult> distinct(String fieldName, Class<TResult> tResultClass) {
          return null;
      }

      @Override
      public <TResult> DistinctIterable<TResult> distinct(String fieldName, Bson filter, Class<TResult> tResultClass) {
          return null;
      }

      @Override
      public <TResult> DistinctIterable<TResult> distinct(ClientSession clientSession, String fieldName, Class<TResult> tResultClass) {
          return null;
      }

      @Override
      public <TResult> DistinctIterable<TResult> distinct(ClientSession clientSession, String fieldName, Bson filter, Class<TResult> tResultClass) {
          return null;
      }

      @Override
      public FindIterable<Cliente> find() {
          return null;
      }

      @Override
      public <TResult> FindIterable<TResult> find(Class<TResult> tResultClass) {
          return null;
      }

      @Override
      public FindIterable<Cliente> find(Bson filter) {
          return null;
      }

      @Override
      public <TResult> FindIterable<TResult> find(Bson filter, Class<TResult> tResultClass) {
          return null;
      }

      @Override
      public FindIterable<Cliente> find(ClientSession clientSession) {
          return null;
      }

      @Override
      public <TResult> FindIterable<TResult> find(ClientSession clientSession, Class<TResult> tResultClass) {
          return null;
      }

      @Override
      public FindIterable<Cliente> find(ClientSession clientSession, Bson filter) {
          return null;
      }

      @Override
      public <TResult> FindIterable<TResult> find(ClientSession clientSession, Bson filter, Class<TResult> tResultClass) {
          return null;
      }

      @Override
      public AggregateIterable<Cliente> aggregate(List<? extends Bson> pipeline) {
          return null;
      }

      @Override
      public <TResult> AggregateIterable<TResult> aggregate(List<? extends Bson> pipeline, Class<TResult> tResultClass) {
          return null;
      }

      @Override
      public AggregateIterable<Cliente> aggregate(ClientSession clientSession, List<? extends Bson> pipeline) {
          return null;
      }

      @Override
      public <TResult> AggregateIterable<TResult> aggregate(ClientSession clientSession, List<? extends Bson> pipeline, Class<TResult> tResultClass) {
          return null;
      }

      @Override
      public ChangeStreamIterable<Cliente> watch() {
          return null;
      }

      @Override
      public <TResult> ChangeStreamIterable<TResult> watch(Class<TResult> tResultClass) {
          return null;
      }

      @Override
      public ChangeStreamIterable<Cliente> watch(List<? extends Bson> pipeline) {
          return null;
      }

      @Override
      public <TResult> ChangeStreamIterable<TResult> watch(List<? extends Bson> pipeline, Class<TResult> tResultClass) {
          return null;
      }

      @Override
      public ChangeStreamIterable<Cliente> watch(ClientSession clientSession) {
          return null;
      }

      @Override
      public <TResult> ChangeStreamIterable<TResult> watch(ClientSession clientSession, Class<TResult> tResultClass) {
          return null;
      }

      @Override
      public ChangeStreamIterable<Cliente> watch(ClientSession clientSession, List<? extends Bson> pipeline) {
          return null;
      }

      @Override
      public <TResult> ChangeStreamIterable<TResult> watch(ClientSession clientSession, List<? extends Bson> pipeline, Class<TResult> tResultClass) {
          return null;
      }

      @Override
      public MapReduceIterable<Cliente> mapReduce(String mapFunction, String reduceFunction) {
          return null;
      }

      @Override
      public <TResult> MapReduceIterable<TResult> mapReduce(String mapFunction, String reduceFunction, Class<TResult> tResultClass) {
          return null;
      }

      @Override
      public MapReduceIterable<Cliente> mapReduce(ClientSession clientSession, String mapFunction, String reduceFunction) {
          return null;
      }

      @Override
      public <TResult> MapReduceIterable<TResult> mapReduce(ClientSession clientSession, String mapFunction, String reduceFunction, Class<TResult> tResultClass) {
          return null;
      }

      @Override
      public BulkWriteResult bulkWrite(List<? extends WriteModel<? extends Cliente>> requests) {
          return null;
      }

      @Override
      public BulkWriteResult bulkWrite(List<? extends WriteModel<? extends Cliente>> requests, BulkWriteOptions options) {
          return null;
      }

      @Override
      public BulkWriteResult bulkWrite(ClientSession clientSession, List<? extends WriteModel<? extends Cliente>> requests) {
          return null;
      }

      @Override
      public BulkWriteResult bulkWrite(ClientSession clientSession, List<? extends WriteModel<? extends Cliente>> requests, BulkWriteOptions options) {
          return null;
      }

      @Override
      public void insertOne(Cliente cliente) {

      }

      @Override
      public void insertOne(Cliente cliente, InsertOneOptions options) {

      }

      @Override
      public void insertOne(ClientSession clientSession, Cliente cliente) {

      }

      @Override
      public void insertOne(ClientSession clientSession, Cliente cliente, InsertOneOptions options) {

      }

      @Override
      public void insertMany(List<? extends Cliente> clientes) {

      }

      @Override
      public void insertMany(List<? extends Cliente> clientes, InsertManyOptions options) {

      }

      @Override
      public void insertMany(ClientSession clientSession, List<? extends Cliente> clientes) {

      }

      @Override
      public void insertMany(ClientSession clientSession, List<? extends Cliente> clientes, InsertManyOptions options) {

      }

      @Override
      public DeleteResult deleteOne(Bson filter) {
          return null;
      }

      @Override
      public DeleteResult deleteOne(Bson filter, DeleteOptions options) {
          return null;
      }

      @Override
      public DeleteResult deleteOne(ClientSession clientSession, Bson filter) {
          return null;
      }

      @Override
      public DeleteResult deleteOne(ClientSession clientSession, Bson filter, DeleteOptions options) {
          return null;
      }

      @Override
      public DeleteResult deleteMany(Bson filter) {
          return null;
      }

      @Override
      public DeleteResult deleteMany(Bson filter, DeleteOptions options) {
          return null;
      }

      @Override
      public DeleteResult deleteMany(ClientSession clientSession, Bson filter) {
          return null;
      }

      @Override
      public DeleteResult deleteMany(ClientSession clientSession, Bson filter, DeleteOptions options) {
          return null;
      }

      @Override
      public UpdateResult replaceOne(Bson filter, Cliente replacement) {
          return null;
      }

      @Override
      public UpdateResult replaceOne(Bson filter, Cliente replacement, UpdateOptions updateOptions) {
          return null;
      }

      @Override
      public UpdateResult replaceOne(Bson filter, Cliente replacement, ReplaceOptions replaceOptions) {
          return null;
      }

      @Override
      public UpdateResult replaceOne(ClientSession clientSession, Bson filter, Cliente replacement) {
          return null;
      }

      @Override
      public UpdateResult replaceOne(ClientSession clientSession, Bson filter, Cliente replacement, UpdateOptions updateOptions) {
          return null;
      }

      @Override
      public UpdateResult replaceOne(ClientSession clientSession, Bson filter, Cliente replacement, ReplaceOptions replaceOptions) {
          return null;
      }

      @Override
      public UpdateResult updateOne(Bson filter, Bson update) {
          return null;
      }

      @Override
      public UpdateResult updateOne(Bson filter, Bson update, UpdateOptions updateOptions) {
          return null;
      }

      @Override
      public UpdateResult updateOne(ClientSession clientSession, Bson filter, Bson update) {
          return null;
      }

      @Override
      public UpdateResult updateOne(ClientSession clientSession, Bson filter, Bson update, UpdateOptions updateOptions) {
          return null;
      }

      @Override
      public UpdateResult updateOne(Bson filter, List<? extends Bson> update) {
          return null;
      }

      @Override
      public UpdateResult updateOne(Bson filter, List<? extends Bson> update, UpdateOptions updateOptions) {
          return null;
      }

      @Override
      public UpdateResult updateOne(ClientSession clientSession, Bson filter, List<? extends Bson> update) {
          return null;
      }

      @Override
      public UpdateResult updateOne(ClientSession clientSession, Bson filter, List<? extends Bson> update, UpdateOptions updateOptions) {
          return null;
      }

      @Override
      public UpdateResult updateMany(Bson filter, Bson update) {
          return null;
      }

      @Override
      public UpdateResult updateMany(Bson filter, Bson update, UpdateOptions updateOptions) {
          return null;
      }

      @Override
      public UpdateResult updateMany(ClientSession clientSession, Bson filter, Bson update) {
          return null;
      }

      @Override
      public UpdateResult updateMany(ClientSession clientSession, Bson filter, Bson update, UpdateOptions updateOptions) {
          return null;
      }

      @Override
      public UpdateResult updateMany(Bson filter, List<? extends Bson> update) {
          return null;
      }

      @Override
      public UpdateResult updateMany(Bson filter, List<? extends Bson> update, UpdateOptions updateOptions) {
          return null;
      }

      @Override
      public UpdateResult updateMany(ClientSession clientSession, Bson filter, List<? extends Bson> update) {
          return null;
      }

      @Override
      public UpdateResult updateMany(ClientSession clientSession, Bson filter, List<? extends Bson> update, UpdateOptions updateOptions) {
          return null;
      }

      @Override
      public Cliente findOneAndDelete(Bson filter) {
          return null;
      }

      @Override
      public Cliente findOneAndDelete(Bson filter, FindOneAndDeleteOptions options) {
          return null;
      }

      @Override
      public Cliente findOneAndDelete(ClientSession clientSession, Bson filter) {
          return null;
      }

      @Override
      public Cliente findOneAndDelete(ClientSession clientSession, Bson filter, FindOneAndDeleteOptions options) {
          return null;
      }

      @Override
      public Cliente findOneAndReplace(Bson filter, Cliente replacement) {
          return null;
      }

      @Override
      public Cliente findOneAndReplace(Bson filter, Cliente replacement, FindOneAndReplaceOptions options) {
          return null;
      }

      @Override
      public Cliente findOneAndReplace(ClientSession clientSession, Bson filter, Cliente replacement) {
          return null;
      }

      @Override
      public Cliente findOneAndReplace(ClientSession clientSession, Bson filter, Cliente replacement, FindOneAndReplaceOptions options) {
          return null;
      }

      @Override
      public Cliente findOneAndUpdate(Bson filter, Bson update) {
          return null;
      }

      @Override
      public Cliente findOneAndUpdate(Bson filter, Bson update, FindOneAndUpdateOptions options) {
          return null;
      }

      @Override
      public Cliente findOneAndUpdate(ClientSession clientSession, Bson filter, Bson update) {
          return null;
      }

      @Override
      public Cliente findOneAndUpdate(ClientSession clientSession, Bson filter, Bson update, FindOneAndUpdateOptions options) {
          return null;
      }

      @Override
      public Cliente findOneAndUpdate(Bson filter, List<? extends Bson> update) {
          return null;
      }

      @Override
      public Cliente findOneAndUpdate(Bson filter, List<? extends Bson> update, FindOneAndUpdateOptions options) {
          return null;
      }

      @Override
      public Cliente findOneAndUpdate(ClientSession clientSession, Bson filter, List<? extends Bson> update) {
          return null;
      }

      @Override
      public Cliente findOneAndUpdate(ClientSession clientSession, Bson filter, List<? extends Bson> update, FindOneAndUpdateOptions options) {
          return null;
      }

      @Override
      public void drop() {

      }

      @Override
      public void drop(ClientSession clientSession) {

      }

      @Override
      public String createIndex(Bson keys) {
          return null;
      }

      @Override
      public String createIndex(Bson keys, IndexOptions indexOptions) {
          return null;
      }

      @Override
      public String createIndex(ClientSession clientSession, Bson keys) {
          return null;
      }

      @Override
      public String createIndex(ClientSession clientSession, Bson keys, IndexOptions indexOptions) {
          return null;
      }

      @Override
      public List<String> createIndexes(List<IndexModel> indexes) {
          return null;
      }

      @Override
      public List<String> createIndexes(List<IndexModel> indexes, CreateIndexOptions createIndexOptions) {
          return null;
      }

      @Override
      public List<String> createIndexes(ClientSession clientSession, List<IndexModel> indexes) {
          return null;
      }

      @Override
      public List<String> createIndexes(ClientSession clientSession, List<IndexModel> indexes, CreateIndexOptions createIndexOptions) {
          return null;
      }

      @Override
      public ListIndexesIterable<Document> listIndexes() {
          return null;
      }

      @Override
      public <TResult> ListIndexesIterable<TResult> listIndexes(Class<TResult> tResultClass) {
          return null;
      }

      @Override
      public ListIndexesIterable<Document> listIndexes(ClientSession clientSession) {
          return null;
      }

      @Override
      public <TResult> ListIndexesIterable<TResult> listIndexes(ClientSession clientSession, Class<TResult> tResultClass) {
          return null;
      }

      @Override
      public void dropIndex(String indexName) {

      }

      @Override
      public void dropIndex(String indexName, DropIndexOptions dropIndexOptions) {

      }

      @Override
      public void dropIndex(Bson keys) {

      }

      @Override
      public void dropIndex(Bson keys, DropIndexOptions dropIndexOptions) {

      }

      @Override
      public void dropIndex(ClientSession clientSession, String indexName) {

      }

      @Override
      public void dropIndex(ClientSession clientSession, Bson keys) {

      }

      @Override
      public void dropIndex(ClientSession clientSession, String indexName, DropIndexOptions dropIndexOptions) {

      }

      @Override
      public void dropIndex(ClientSession clientSession, Bson keys, DropIndexOptions dropIndexOptions) {

      }

      @Override
      public void dropIndexes() {

      }

      @Override
      public void dropIndexes(ClientSession clientSession) {

      }

      @Override
      public void dropIndexes(DropIndexOptions dropIndexOptions) {

      }

      @Override
      public void dropIndexes(ClientSession clientSession, DropIndexOptions dropIndexOptions) {

      }

      @Override
      public void renameCollection(MongoNamespace newCollectionNamespace) {

      }

      @Override
      public void renameCollection(MongoNamespace newCollectionNamespace, RenameCollectionOptions renameCollectionOptions) {

      }

      @Override
      public void renameCollection(ClientSession clientSession, MongoNamespace newCollectionNamespace) {

      }

      @Override
      public void renameCollection(ClientSession clientSession, MongoNamespace newCollectionNamespace, RenameCollectionOptions renameCollectionOptions) {

      }
  };

    public static List<Cliente>lista = new LinkedList<>();

>>>>>>> 108d8b2bb3439fc3b21f54a41a9bfa8966b39e34

    public ClienteRepositorioImpl(MongoDatabase database) {
        this.clientes = database.getCollection(COLLECTION_NAME, Cliente.class);
    }

<<<<<<< HEAD
    @Override
    public void create(Cliente cliente) {
<<<<<<< HEAD

        //INGRESO VIA POSTMAN
        lista = new LinkedList<>(ClienteFlyweightMain.clientesFlyweight);

        System.out.println("entrando: " + cliente.toString());
        // cliente.setId((new ObjectId()).toString());

        //  System.out.println("\nCLIENTE REGISTRADO CORRECTAMENTE");
        //  System.out.println( objCli.imprimeDatosCliente(cliente));

        //INGRESO VIA GUI
=======
    public ClienteRepositorioImpl() {
    }

    @Override
    public void create(Cliente cliente) {
        
        //INGRESO VIA POSTMAN
        lista = new LinkedList<>(ClienteFlyweightMain.clientesFlyweight);

       System.out.println("entrando: " + cliente.toString());
       // cliente.setId((new ObjectId()).toString());

       //  System.out.println("\nCLIENTE REGISTRADO CORRECTAMENTE");
      //  System.out.println( objCli.imprimeDatosCliente(cliente));

      //INGRESO VIA GUI
>>>>>>> 108d8b2bb3439fc3b21f54a41a9bfa8966b39e34

        cliente.setId((new ObjectId()).toString());
        cliente.setNombre(lista.get(lista.size()-1).getNombre());
        cliente.setNumeroDocumento(lista.get(lista.size()-1).getNumeroDocumento());
        cliente.setDireccion(lista.get(lista.size()-1).getDireccion());

        String paisNacimiento = ClienteFlyweightMain.clientesFlyweight.get(ClienteFlyweightMain.clientesFlyweight.size()-1).getPaisNacimiento();
        String paisDomiciliado = ClienteFlyweightMain.clientesFlyweight.get(ClienteFlyweightMain.clientesFlyweight.size()-1).getPaisDomiciliado();

        cliente.setClif(lista.get(lista.size()-1),new ClienteFlyweight(paisNacimiento,paisDomiciliado));

<<<<<<< HEAD
        // clientes.insertOne(cliente); // PARA POSTMAN Y GUI

        // System.out.println("\nCLIENTE REGISTRADO CORRECTAMENTE");
        // System.out.println( objCli.imprimeDatosCliente(cliente));  //INGRESO VIA POSTMAN
        // System.out.println( objCli.imprimeDatosCliente(lista.get(lista.size()-1))); //INGRESO VIA GUI

=======
        //System.out.println("entrando: " + cliente);
        cliente.setId((new ObjectId()).toString());
>>>>>>> 831e962f4cbcb481952f4526c3cdd0402f4aa8ec
        clientes.insertOne(cliente);
    }
=======
       // clientes.insertOne(cliente); // PARA POSTMAN Y GUI
            
       // System.out.println("\nCLIENTE REGISTRADO CORRECTAMENTE");
       // System.out.println( objCli.imprimeDatosCliente(cliente));  //INGRESO VIA POSTMAN
      // System.out.println( objCli.imprimeDatosCliente(lista.get(lista.size()-1))); //INGRESO VIA GUI

        clientes.insertOne(cliente);
                                                                 }
>>>>>>> 108d8b2bb3439fc3b21f54a41a9bfa8966b39e34

    @Override
    public void delete(String id) {
        clientes.deleteOne(new Document("_id", id));
    }

    @Override
    public Cliente find(String id) {
        //System.out.println("_id: " + id);
        return clientes.find(eq("_id", id)).first();
    }

    @Override
    public List<Cliente> findAll() {
        List<Cliente> result = new LinkedList<>();

        for (Cliente cliente : clientes.find()) {
            //System.out.println("customer: " + customer);
            result.add(cliente);
        }

        return result;
    }

    @Override
    public Cliente update(Cliente post, String id) {
        return clientes.findOneAndReplace(new Document("_id", id), post, UPDATE_OPTIONS);
<<<<<<< HEAD
<<<<<<< HEAD
                                                   }
=======
    }
>>>>>>> 831e962f4cbcb481952f4526c3cdd0402f4aa8ec
    
=======
                                                   }

>>>>>>> 108d8b2bb3439fc3b21f54a41a9bfa8966b39e34
}